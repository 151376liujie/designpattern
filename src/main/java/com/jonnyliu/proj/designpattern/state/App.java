package com.jonnyliu.proj.designpattern.state;

public class App {


    public static void main(String[] args) {
        Context context = new Context();

        context.bookRoom();
        System.out.println("预定房间后状态: " + context.getState());

        context.checkinRoom();
        System.out.println("入住房间后状态: " + context.getState());

        context.checkoutRoom();
        System.out.println("退房间后状态: " + context.getState());

        context.cancelBookRoom();
        System.out.println("取消预定后状态: " + context.getState());

    }

}
