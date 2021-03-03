package com.jonnyliu.proj.designpattern.vistor;

import java.math.BigDecimal;

/**
 * 购物车清单,一个被访问的目标对象
 *
 * @author liujie
 */
public interface ShoppingCartItem {

    /**
     * 获取商品名称
     *
     * @return
     */
    String getGoodsName();

    /**
     * 获取商品价格
     *
     * @return
     */
    BigDecimal getGoodsPrice();

    /**
     * 获取商品购买数量
     *
     * @return
     */
    int getCount();

    /**
     * 接受一个访问者
     *
     * @param visitor
     */
    void accept(Visitor visitor);

}
