package com.jonnyliu.proj.designpattern.compose;


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
     * 执行的业务方法
     */
    abstract void operation();

    /**
     * 添加组件
     *
     * @param component
     */
    abstract void addComposite(BaseComponent component);

    /**
     * 删除组件
     *
     * @param component
     */
    abstract void removeComposite(BaseComponent component);

}
