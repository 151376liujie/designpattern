package com.jonnyliu.proj.designpattern.state;

/**
 * 客房空闲状态
 * @author liujie
 */
public class FreeTimeState extends State {

    public FreeTimeState(Context context) {
        super(context);
    }

    @Override
    public void bookRoom() {
        System.out.println("[客人办理预定业务]...预定业务办理成功");
        this.context.setState(new BookedState(context));
    }

    @Override
    public void cancelBookRoom() {
        System.out.println("[客人办理取消预定业务], 客房未被预定,不能办理取消预定业务...");
        throw new UnsupportedOperationException("客房未被预定,不能办理取消预定业务");
    }

    @Override
    public void checkinRoom() {
        System.out.println("[客人办理入住业务], 办理入住业务成功...");
        this.context.setState(new CheckinState(this.context));
    }

    @Override
    public void checkoutRoom() {
        System.out.println("[客人办理退房业务], 客房空闲状态,不能办理退房业务...");
        throw new UnsupportedOperationException("客房空闲状态,不能办理退房业务");
    }
}
