package cn.xm.redisChat.groupChat;

import cn.xm.jwxt.bean.system.User;
import cn.xm.redisChat.util.JedisPoolUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

/**
 * @Author: qlq
 * @Description 消息消费者(订阅频道消费消息)
 * @Date: 16:12 2018/10/14
 */
public class MessageConsumer {
    private static final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    public static void consumerMsg(final User user, final String roomName) {
        if (!RoomUtil.userIsInRoom(user, roomName)) {
            RoomUtil.enterRoom(user, roomName);
        }

        final Jedis jedis = JedisPoolUtils.getJedis();
        //新建一个线程，线程池获取消息
        Thread t = new Thread() {
            @Override
            public void run() {
                jedis.subscribe(new JedisPubSub() {
                    @Override
                    public void onMessage(String channel, String message) {
                        //如果收到退订信号就退订频道
                        String exitSignal = user.getUsername() + ":exit:" + roomName;
                        if (exitSignal.equals(message)) {
                            unsubscribe(channel);
                            log.info("============" + exitSignal + "============,channel->{}", channel);
                        } else if (!message.contains(":exit:")) {
                            log.info("{} consume msg:{},room is->{}", user.getUsername(), message, channel);
                        }
                    }

                    @Override
                    public void unsubscribe(String... channels) {
                        log.info("==============unsubscribe {}========", channels);
                        super.unsubscribe(channels);
                    }
                }, roomName);
            }
        };
        t.start();
    }
}
