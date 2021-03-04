package com.jonnyliu.proj.designpattern.state;

public class App {


    public static void main(String[] args) {
        Context context = new Context();
        State employeeState = new EmployeeState();
        context.setState(employeeState);
        context.request();
        context.request();
        context.request();
    }

}
