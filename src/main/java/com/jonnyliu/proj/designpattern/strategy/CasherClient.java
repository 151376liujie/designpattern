package com.jonnyliu.proj.designpattern.strategy;

/**
 * 策略模式：
 * 场景如下：超市收银时的各种打折策略（原价销售、八折、返利、满减等等）
 * <p/>
 * User: jonnyliu@tcl.com <br/>
 * Date: on 2016-09-02 11:24.
 */
public class CasherClient {

    public static void main(String[] args) {

        ComputeStrategyContext computeStrategyContext = new ComputeStrategyContext(ComputeWay.NORMAL);
        double price = computeStrategyContext.getPrice(100);
        System.out.println(price);

        computeStrategyContext = new ComputeStrategyContext(ComputeWay.OFF_PRICE);
        price = computeStrategyContext.getPrice(100);
        System.out.println(price);

        computeStrategyContext = new ComputeStrategyContext(ComputeWay.RETURN_PRICE);
        price = computeStrategyContext.getPrice(500);
        System.out.println(price);

    }
}
