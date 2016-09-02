package com.jonnyliu.proj.designpattern.strategy;

/**
 * 价格计算策略接口
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 11:27.
 */
public interface ComputeStrategy {


    /**
     * 计算价格的方法
     * @return
     */
    double computePrice(double oldPrice);


}
