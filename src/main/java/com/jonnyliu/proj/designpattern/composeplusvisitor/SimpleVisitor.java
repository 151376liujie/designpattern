package com.jonnyliu.proj.designpattern.composeplusvisitor;

import java.util.List;

/**
 * 简单访问器
 *
 * @author liujie
 */
public class SimpleVisitor implements Visitor {

    @Override
    public void visit(BaseComponent component) {

        List<BaseComponent> components = component.getComponents();
        if (components != null && !components.isEmpty()) {
            for (BaseComponent baseComponent : components) {
                baseComponent.accept(this);
            }
        }
        System.out.println(String.format("==执行%s的业务逻辑", component.name));
    }
}
