package com.jonnyliu.proj.designpattern.compose;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujie
 */
public class Composite extends BaseComponent {

    private List<BaseComponent> components = new ArrayList<BaseComponent>();

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
}
