package com.jonnyliu.proj.designpattern.composeplusvisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujie
 */
public class Composite extends BaseComponent {

    private List<BaseComponent> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    void operation() {

        for (BaseComponent component : components) {
            component.operation();
        }
        System.out.println(String.format("执行%s的业务逻辑", this.name));
    }

    @Override
    void addComposite(BaseComponent component) {
        components.add(component);
    }

    @Override
    void removeComposite(BaseComponent component) {
        components.remove(component);
    }

    @Override
    List<BaseComponent> getComponents() {
        return components;
    }

    @Override
    void accept(Visitor visitor) {
        if (!this.getComponents().isEmpty()) {
            //访问当前节点
            visitor.visit(this);
            for (BaseComponent component : this.getComponents()) {
                component.accept(visitor);
            }
        }
    }
}
