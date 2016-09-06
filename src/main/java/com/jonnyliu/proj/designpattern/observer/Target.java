package com.jonnyliu.proj.designpattern.observer;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察目标
 * author:980463316@qq.com
 * Created on 2016-09-06 22:54.
 */
public class Target implements ObserverTarget {

    private List<Observable> observables = new ArrayList<Observable>();

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        this.notifyObserver();
    }


    public void registerObserver(Observable observer) {
        observables.add(observer);
    }

    public void removeObserver(Observable observer) {
        observables.remove(observer);
    }

    public void notifyObserver() {
        for (Observable observable :observables){
            observable.update(score);
        }
    }
}
