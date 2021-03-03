package com.jonnyliu.proj.designpattern.vistor;

import java.math.BigDecimal;

/**
 * 智能💻实现类
 *
 * @author liujie
 */
public class Goods implements ShoppingCartItem {

    private final String goodsName;
    private final BigDecimal goodsPrice;
    private final int count;

    public Goods(String goodsName, BigDecimal goodsPrice, int count) {
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.count = count;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return this.goodsPrice;
    }

    public int getCount() {
        return count;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
