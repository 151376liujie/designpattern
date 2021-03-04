package com.jonnyliu.proj.designpattern.state;

public class DirectorState implements State {

    private Context context;

    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void handle() {

        System.out.println("总监审批通过,打款10000");


    }
}
