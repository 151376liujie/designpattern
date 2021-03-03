package com.jonnyliu.proj.designpattern.compose;

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
    void operation() {
        System.out.println(String.format("执行%s的业务方法", this.name));
    }

    @Override
    void addComposite(BaseComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    void removeComposite(BaseComponent component) {
        throw new UnsupportedOperationException();
    }
}
