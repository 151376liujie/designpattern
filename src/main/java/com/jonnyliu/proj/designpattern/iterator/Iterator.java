package com.jonnyliu.proj.designpattern.iterator;

/**
 * 迭代器模式
 *
 * @param <E>
 * @author liujie
 */
public interface Iterator<E> {

    /**
     * 是否还有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return
     */
    E next();

}
