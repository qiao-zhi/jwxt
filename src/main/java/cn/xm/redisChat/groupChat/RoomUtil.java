package cn.xm.redisChat.groupChat;

import cn.xm.jwxt.bean.system.User;
import cn.xm.redisChat.util.JedisPoolUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

/**
 * @Author: qlq
 * @Description 进入房间的工具类(订阅某个channel，代表进入房间)
 * @Date: 16:15 2018/10/14
 */
public class RoomUtil {

    private static final Logger log = LoggerFactory.getLogger(RoomUtil.class);

    /**
     * 进入房间
     *
     * @param user     用户
     * @param roomName
     */
    public static void enterRoom(User user, String roomName) {
        Jedis jedis = JedisPoolUtils.getJedis();
        String username = user.getUsername();
        Boolean sismember = jedis.sismember(roomName + "users", username);
        if (!sismember) {
            jedis.sadd(roomName + "users", username);
            log.info("{} 已经成功进入房间  {}！", username, roomName);
        } else {
            log.info("{} 已经进入房间，不能重复进入！", username);
        }
    }

    /**
     * 退出房间
     *
     * @param user     用户
     * @param roomName 房间名称
     */
    public static void exitRoom(User user, String roomName) {
        Jedis jedis = JedisPoolUtils.getJedis();
        String username = user.getUsername();
        Boolean sismember = jedis.sismember(roomName + "users", username);
        if (sismember) {
            //从成员组中移除
            jedis.srem(roomName + "users", username);
            //发送退订信号(房间内的成员收到该信号后退订)
            String exitSignal = user.getUsername() + ":exit:" + roomName;
            jedis.publish(roomName, exitSignal);
            log.info("{} 已经发出移除房间  {}的信号！", username, roomName);
        } else {
            log.info("{} 已经不在房间内！", username);
        }
    }

    /**
     * 判断用户是否在某个房间
     *
     * @param user
     * @param roomName
     * @return
     */
    public static boolean userIsInRoom(User user, String roomName) {
        Jedis jedis = JedisPoolUtils.getJedis();
        return jedis.sismember(roomName + "users", user.getUsername());
    }
}