package cn.xm.redisChat.one2one;

import cn.xm.jwxt.bean.system.User;

/**
 * @Author: qlq
 * @Description 生产消息测试
 * @Date: 23:59 2018/10/13
 */

public class ProducerMessageApp {
    public static void main(String[] args) {
        User sndUser = new User();
        sndUser.setUsername("zhangsan");

        User sndToUser = new User();
        sndToUser.setUsername("lisi");

        User sndToUser2 = new User();
        sndToUser2.setUsername("wangwu");

        RedisMessageProducer.sendMessage(sndUser, sndToUser, "给李四的消息一", "给李四的消息二");
        RedisMessageProducer.sendMessage(sndUser, sndToUser2, "给王五的消息一", "给王五的消息二");
    }
}
