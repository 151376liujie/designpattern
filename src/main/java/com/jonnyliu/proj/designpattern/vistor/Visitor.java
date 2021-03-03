package com.jonnyliu.proj.designpattern.vistor;

/**
 * 访问者接口,不通的访问者有不同的实现
 *
 * @author liujie
 */
public interface Visitor {

    /**
     * 访问器,针对某个目前接口的访问方法
     *
     * @param cartItem
     */
    void visit(ShoppingCartItem cartItem);

}
