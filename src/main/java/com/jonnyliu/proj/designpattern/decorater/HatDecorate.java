package com.jonnyliu.proj.designpattern.decorater;

/**
 * 帽子的装饰
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 15:39.
 */
public class HatDecorate extends AbstractDecorater {

    @Override
    public void show() {
        super.show();
        System.out.println("帽子的装饰");
    }
}
