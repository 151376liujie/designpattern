package com.jonnyliu.proj.designpattern.template;

/**
 * 张三回家
 *
 * @author liujie
 */
public class ZhangSan extends Action {

    @Override
    protected void boarding() {
        System.out.println("张三回家");
    }

    @Override
    protected void toStation() {
        System.out.println("张三坐车去车站");
    }

    @Override
    protected void buyTicket() {
        System.out.println("张三使用APP购买车票");
    }
}
