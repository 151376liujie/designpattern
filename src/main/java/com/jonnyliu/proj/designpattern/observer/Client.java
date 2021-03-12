package com.jonnyliu.proj.designpattern.observer;

/**
 * author:980463316@qq.com
 * Created on 2016-09-06 22:59.
 */
public class Client {

    public static void main(String[] args) {
        Topic topic = new Topic();
        topic.addObserver(new TopicObserver());
        topic.sendMessage("hello,world");
        topic.sendMessage("happy new year");
    }
}
