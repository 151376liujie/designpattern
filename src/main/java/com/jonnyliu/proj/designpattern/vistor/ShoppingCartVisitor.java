package com.jonnyliu.proj.designpattern.vistor;

import java.math.BigDecimal;

/**
 * 购物车清单访问器
 *
 * @author liujie
 */
public class ShoppingCartVisitor implements Visitor {

    private BigDecimal totalprice;

    public void visit(ShoppingCartItem cartItem) {
        if (totalprice == null) {
            totalprice = BigDecimal.ZERO;
        }
        System.out.println("开始计算:[" + cartItem.getGoodsName() + "]的价格...");
        totalprice = totalprice.add(cartItem.getGoodsPrice().multiply(BigDecimal.valueOf(cartItem.getCount())));
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }
}
