package com.jonnyliu.proj.designpattern.decorater;

/**
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 15:28.
 */
public class AbstractDecorater implements Decorater {

    private DecorateTarget decorateTarget;

    public void show() {
        decorateTarget.show();
    }

    public void decorate(DecorateTarget decorateTarget) {
        this.decorateTarget = decorateTarget;
    }
}
