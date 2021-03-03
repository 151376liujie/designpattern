package com.jonnyliu.proj.designpattern.template;

/**
 * 李四回家
 *
 * @author liujie
 */
public class LiSi extends Action {

    @Override
    protected void boarding() {
        System.out.println("李四躺着上车");
    }

    @Override
    protected void toStation() {
        System.out.println("李四走路去车站");
    }

    @Override
    protected void buyTicket() {
        System.out.println("李四找人购买车票");
    }
}
