package com.jonnyliu.proj.designpattern.observer;

/**
 * author:980463316@qq.com
 * Created on 2016-09-06 22:59.
 */
public class Client {

    public static void main(String[] args) {
        Observable observable = new Observable() {
            public void update(int score) {
                System.out.println("score变化了。。。" +score );
            }
        };

        Observable observable2 = new Observable() {
            public void update(int score) {
                System.out.println("score变化了。。。" +score );
            }
        };
        Target target = new Target();
        target.registerObserver(observable);
        target.registerObserver(observable2);
        target.setScore(38);
    }
}
