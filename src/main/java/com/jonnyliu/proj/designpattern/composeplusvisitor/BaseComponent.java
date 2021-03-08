package com.jonnyliu.proj.designpattern.composeplusvisitor;


import java.util.List;

/**
 * 代表一个容器
 *
 * @author liujie
 */
public abstract class BaseComponent {

    protected String name;

    public BaseComponent(String name) {
        this.name = name;
    }


    /**
     * 添加组件
     *
     * @param component
     */
    abstract void addComposite(BaseComponent component);


    /**
     * 获取组件列表
     *
     * @return
     */
    abstract List<BaseComponent> getComponents();

    /**
     * 接受一个访问器
     *
     * @param visitor
     */
    abstract void accept(Visitor visitor);

}
