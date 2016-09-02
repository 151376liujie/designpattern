package com.jonnyliu.proj.designpattern.strategy;

/**
 * 原价
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 11:28.
 */
public class NormalCompute implements ComputeStrategy {

    public double computePrice(double oldPrice) {
        return oldPrice;
    }
}
