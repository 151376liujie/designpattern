package com.jonnyliu.proj.designpattern.decorater;

/**
 * 装饰器模式
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 14:52.
 */
public class DecoraterClient {

    public static void main(String[] args) {
        DecorateTarget decorateTarget = new People();

        Decorater clothesDecorate = new ClothesDecorate();
        clothesDecorate.decorate(decorateTarget);

        Decorater shoesDecorate = new ShoesDecorate();
        shoesDecorate.decorate(clothesDecorate);

        Decorater hatDecorate = new HatDecorate();
        hatDecorate.decorate(shoesDecorate);

        hatDecorate.show();
    }
}
