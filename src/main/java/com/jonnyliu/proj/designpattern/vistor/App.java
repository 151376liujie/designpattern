package com.jonnyliu.proj.designpattern.vistor;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 启动类
 *
 * @author liujie
 */
public class App {

    public static void main(String[] args) {

        ShoppingCartVisitor visitor = new ShoppingCartVisitor();
        ShoppingCartItem goods1 = new Goods("苹果", new BigDecimal("4.3"), 3);
        ShoppingCartItem goods2 = new Goods("矿泉水", new BigDecimal("3.0"), 1);
        ShoppingCartItem goods3 = new Goods("洗发水", new BigDecimal("67.8"), 1);

        for (ShoppingCartItem cartItem : Arrays.asList(goods1, goods2, goods3)) {
            cartItem.accept(visitor);
        }

        System.out.println("此次购物总价为: " + visitor.getTotalprice());

    }

}
