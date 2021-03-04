package com.jonnyliu.proj.designpattern.state;

public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    void request() {
        state.handle();
    }
}
