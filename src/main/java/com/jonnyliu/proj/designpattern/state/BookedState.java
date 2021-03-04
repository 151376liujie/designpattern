package com.jonnyliu.proj.designpattern.state;

/**
 * 客房已预定状态
 * @author liujie
 */
public class BookedState extends State {

    public BookedState(Context context) {
        super(context);
    }

    @Override
    public void bookRoom() {
        System.out.println("[客人办理预定业务], 客房已被预定,无法再次预定...");
        throw new UnsupportedOperationException("客房已被预定,无法再次预定");
    }

    @Override
    public void cancelBookRoom() {
        System.out.println("[客人办理取消预定], 取消预定成功...");
        this.context.setState(new FreeTimeState(this.context));
    }

    @Override
    public void checkinRoom() {
        System.out.println("[客人办理入住业务], 办理入住成功...");
        this.context.setState(new CheckinState(this.context));
    }

    @Override
    public void checkoutRoom() {
        System.out.println("[客人办理退房业务], 客房已被预定,无法办理退房业务...");
        throw new UnsupportedOperationException("客房已被预定,无法办理退房业务");
    }
}
