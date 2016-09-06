package com.jonnyliu.proj.designpattern.observer;

import java.util.Observer;

/**
 * 被观察的对象
 * author:980463316@qq.com
 * Created on 2016-09-06 22:50.
 */
public interface ObserverTarget {

    /**
     * 注册观察员
     * @param observer
     */
    void registerObserver(Observable observer);

    /**
     * 移除观察员
     * @param observerTarget
     */
    void removeObserver(Observable observerTarget);

    /**
     * 当自身状态变化时提醒观察员
     */
    void notifyObserver();
}
