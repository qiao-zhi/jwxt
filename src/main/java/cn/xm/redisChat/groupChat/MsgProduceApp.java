package cn.xm.redisChat.groupChat;

import cn.xm.jwxt.bean.system.User;
import org.junit.Test;

/**
 * @Author: qlq
 * @Description
 * @Date: 21:46 2018/10/14
 */
public class MsgProduceApp {
    public static void main(String[] args) {
        String roomName1 = "room1", roomName2 = "room2";
        User sendUser = new User();
        sendUser.setUsername("zhangsan");

        MessageProducer.produceMsg(sendUser, roomName1, "消息一", "消息二");
        MessageProducer.produceMsg(sendUser, roomName2, "消息一一", "消息二二");
    }

    /**
     * 将用户lisi移除房间2
     */
    @Test
    public void fun2() {
        User user = new User();
        user.setUsername("lisi");
        RoomUtil.exitRoom(user, "room2");
    }
}
