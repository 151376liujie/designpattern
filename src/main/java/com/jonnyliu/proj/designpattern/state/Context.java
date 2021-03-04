package com.jonnyliu.proj.designpattern.state;

public class Context {

    private State state;

    public Context() {
        this.state = new FreeTimeState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    void bookRoom() {
        state.bookRoom();
    }

    void cancelBookRoom(){
        state.cancelBookRoom();
    }

    void checkinRoom(){
        state.checkinRoom();
    }

    void checkoutRoom(){
        state.checkoutRoom();
    }
}
