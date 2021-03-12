package com.jonnyliu.proj.designpattern.observer;

import java.util.Observable;

/**
 * @author liujie
 */
public class Topic extends Observable {


    public void sendMessage(String message) {
        this.setChanged();
        this.notifyObservers(message);
    }

}
