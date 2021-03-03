package com.jonnyliu.proj.designpattern.composeplusvisitor;

/**
 * 简单访问器
 *
 * @author liujie
 */
public class SimpleVisitor implements Visitor {

    @Override
    public void visit(BaseComponent component) {

        System.out.println(String.format("执行%s的业务逻辑", component.name));
    }
}
