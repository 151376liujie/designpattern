package com.jonnyliu.proj.designpattern.template;

public abstract class Action {

    /**
     * 模板方法,该方法定义了回家的每个步骤
     */
    public final void goHome() {
        //买票
        buyTicket();
        //去车站
        toStation();
        //上车
        boarding();
    }

    protected abstract void boarding();

    protected abstract void toStation();

    protected abstract void buyTicket();

}
