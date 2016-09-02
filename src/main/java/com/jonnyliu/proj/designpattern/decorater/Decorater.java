package com.jonnyliu.proj.designpattern.decorater;

/**
 * 装饰器
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 14:54.
 */
public interface Decorater extends DecorateTarget{

    /**
     * 对指定的目标进行装饰
     * @param decorateTarget
     */
    void decorate(DecorateTarget decorateTarget);

}
