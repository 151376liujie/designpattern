package com.jonnyliu.proj.designpattern.strategy;

/**
 * 原价基础上打折策略
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 11:37.
 */
public class OffPriceComputeStrategy implements ComputeStrategy {

    /**
     * 打折系数
     */
    private double offPrice;

    public OffPriceComputeStrategy(double offPrice) {
        this.offPrice = offPrice;
    }

    public double computePrice(double oldPrice) {
        return oldPrice * offPrice;
    }
}
