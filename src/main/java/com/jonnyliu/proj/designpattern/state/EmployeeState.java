package com.jonnyliu.proj.designpattern.state;

public class EmployeeState implements State {

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

        System.out.println("主管审批通过,下一步经理审批");

        context.setState(new ManagerState());

    }
}
