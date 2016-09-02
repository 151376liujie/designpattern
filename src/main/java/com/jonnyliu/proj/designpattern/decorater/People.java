package com.jonnyliu.proj.designpattern.decorater;

/**
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 15:00.
 */
public class People implements DecorateTarget {

    public void show() {
        System.out.println("i am a coder...");
    }
}
