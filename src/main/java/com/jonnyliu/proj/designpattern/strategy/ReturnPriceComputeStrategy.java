package com.jonnyliu.proj.designpattern.strategy;

/**
 * 满返策略
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 11:33.
 */
public class ReturnPriceComputeStrategy implements ComputeStrategy{
    /**
     * 满返条件
     */
    private double condition;

    /**
     * 满返金额
     */
    private double returnAmount;

    public ReturnPriceComputeStrategy(double condition, double returnAmount) {
        this.condition = condition;
        this.returnAmount = returnAmount;
    }

    public double computePrice(double oldPrice) {
        if (oldPrice >= condition){
            return oldPrice - returnAmount;
        }
        return oldPrice;
    }

}
