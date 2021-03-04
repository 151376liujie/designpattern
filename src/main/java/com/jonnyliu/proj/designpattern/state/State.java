package com.jonnyliu.proj.designpattern.state;

/**
 * @author liujie
 * 状态模式接口
 */
public abstract class State {

    protected Context context;

    public State(Context context) {
        this.context = context;
    }

    /**
     * 预定房间
     */
    abstract void bookRoom();

    /**
     * 取消预定
     */
    abstract void cancelBookRoom();

    /**
     * 用户入住
     */
    abstract void checkinRoom();

    /**
     * 用户退房
     */
    abstract void checkoutRoom();
}
