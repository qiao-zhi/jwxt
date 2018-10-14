package cn.xm.redisChat.groupChat;

import cn.xm.jwxt.bean.system.User;
import cn.xm.redisChat.util.JedisPoolUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

/**
 * @Author: qlq
 * @Description 消息生产者
 * @Date: 18:09 2018/10/14
 */
public class MessageProducer {
    private static final Logger log = LoggerFactory.getLogger(MessageProducer.class);

    public static void produceMsg(final User sendUser, String roomName, String... messages) {
        //发送消息
        Jedis jedis = JedisPoolUtils.getJedis();
        for (int i = 0, length_1 = messages.length; i < length_1; i++) {
            String msg = sendUser.getUsername() + "*-*" + messages[i];
            log.debug(msg);
            jedis.publish(roomName, msg);//发送消息
        }
    }
}
