package com.jonnyliu.proj.designpattern.composeplusvisitor;

import java.util.Collections;
import java.util.List;

/**
 * 代表叶子节点
 *
 * @author liujie
 */
public class Leaf extends BaseComponent {

    public Leaf(String name) {
        super(name);
    }


    @Override
    void addComposite(BaseComponent component) {
        throw new UnsupportedOperationException();
    }


    @Override
    List<BaseComponent> getComponents() {
        return Collections.emptyList();
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
