package com.jonnyliu.proj.designpattern.state;

/**
 * @author liujie
 */
public class ManagerState implements State {

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

        System.out.println("经理审批通过,下一步总监审批");
        context.setState(new DirectorState());

    }
}
