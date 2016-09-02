package com.jonnyliu.proj.designpattern.decorater;

/**
 * 鞋子的装饰
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 15:17.
 */
public class ShoesDecorate extends AbstractDecorater {

    @Override
    public void show() {
        super.show();
        System.out.println("鞋子的装饰");
    }
}
