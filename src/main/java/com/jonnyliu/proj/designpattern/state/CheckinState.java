package com.jonnyliu.proj.designpattern.state;

/**
 * 客房已入住状态
 * @author liujie
 */
public class CheckinState extends State {

    public CheckinState(Context context) {
        super(context);
    }

    @Override
    public void bookRoom() {
        System.out.println("[客人办理预定业务]...客房已入住,无法办理预定业务");
        throw new UnsupportedOperationException("客房已入住,无法办理预定业务");
    }

    @Override
    public void cancelBookRoom() {
        System.out.println("[客人办理取消预定业务]...客房已入住,无法办理取消预定业务");
        throw new UnsupportedOperationException("客房已入住,无法办理取消预定业务");
    }

    @Override
    public void checkinRoom() {
        System.out.println("[客人办理取消预定业务]...客房已入住,无法办理入住业务");
        throw new UnsupportedOperationException("客房已入住,无法办理入住业务");
    }

    @Override
    public void checkoutRoom() {
        System.out.println("[客人办理退房业务]...退房业务办理成功");
        this.context.setState(new FreeTimeState(this.context));
    }
}
