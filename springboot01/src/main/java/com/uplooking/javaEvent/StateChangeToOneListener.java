package com.uplooking.javaEvent;

import java.util.EventListener;

/**
 *
 * @author Thief
 *
 */
public class StateChangeToOneListener implements EventListener {

    public void handleEvent(MyEvent event) {
        System.out.println("触发状态变为1的事件。。。");
        System.out.println("当前事件源状态为：" + event.getSourceState());
        System.out.println("。。。。。。。。。。。。。。。。。。。。。。。");
    }

}
