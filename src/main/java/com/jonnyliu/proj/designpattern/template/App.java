package com.jonnyliu.proj.designpattern.template;

public class App {


    public static void main(String[] args) {

        ZhangSan zhangSan = new ZhangSan();
        LiSi liSi = new LiSi();
        zhangSan.goHome();
        System.out.println("===========================");
        liSi.goHome();

    }

}
