package com.jonnyliu.proj.designpattern.strategy;

/**
 * 策略上下文
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 11:39.
 */
public class ComputeStrategyContext {

    private ComputeStrategy computeStrategy;

    public double getPrice(double oldPrice){
        return computeStrategy.computePrice(oldPrice);
    }

    public ComputeStrategyContext(ComputeWay computeWay){
        switch (computeWay){
            case NORMAL:
                computeStrategy = new NormalComputeStrategy();
                break;
            case RETURN_PRICE:
                computeStrategy = new ReturnPriceComputeStrategy(300,30);
                break;
            case OFF_PRICE:
                computeStrategy = new OffPriceComputeStrategy(0.8);
                break;
            default:
                computeStrategy = null;
        }
    }
}
