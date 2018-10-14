package cn.xm.redisChat.groupChat;

import cn.xm.jwxt.bean.system.User;

/**
 * @Author: qlq
 * @Description
 * @Date: 18:19 2018/10/14
 */
public class MsgConsumeApp {

    public static void main(String[] args) {
        String roomName1 = "room1", roomName2 = "room2";
        User sendUser = new User();
        sendUser.setUsername("lisi");
        User sendUser2 = new User();
        sendUser2.setUsername("wangwu");

        MessageConsumer.consumerMsg(sendUser, roomName1);
        MessageConsumer.consumerMsg(sendUser, roomName2);

        MessageConsumer.consumerMsg(sendUser2, roomName2);
    }
}
