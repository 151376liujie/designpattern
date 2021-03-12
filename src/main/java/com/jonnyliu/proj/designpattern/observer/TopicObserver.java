package com.jonnyliu.proj.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的被观察目标
 * author:980463316@qq.com
 * Created on 2016-09-06 22:54.
 */
public class TopicObserver implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("接收到目标对象已改变");
        System.out.println("o = " + o + ", arg = " + arg);
    }
}
