package cn.xm.redisChat.one2one;

import cn.xm.jwxt.bean.system.User;

/**
 * @Author: qlq
 * @Description 消息消息
 * @Date: 0:04 2018/10/14
 */
public class ConsumerMessageApp {

    public static void main(String[] args) {
        User sndToUser = new User();
        sndToUser.setUsername("lisi");

        User sndToUser2 = new User();
        sndToUser2.setUsername("wangwu");

        RedisMessageConsumer.consumerMessage(sndToUser);
        RedisMessageConsumer.consumerMessage(sndToUser2);
    }
}
