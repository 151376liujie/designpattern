package com.jonnyliu.proj.designpattern.decorater;

/**
 * 衣服的装饰
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 14:58.
 */
public class ClothesDecorate extends AbstractDecorater {


    public void show() {
        super.show();
        System.out.println("衣服的装饰");
    }
}
