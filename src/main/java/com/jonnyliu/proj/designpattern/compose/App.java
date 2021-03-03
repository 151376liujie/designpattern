package com.jonnyliu.proj.designpattern.compose;


/**
 * @author liujie
 */
public class App {


    public static void main(String[] args) {
        BaseComponent leaf1 = new Leaf("叶子节点1");
        BaseComponent leaf2 = new Leaf("叶子节点2");
        BaseComponent leaf3 = new Leaf("叶子节点3");
        BaseComponent leaf4 = new Leaf("叶子节点4");
        Composite subroot1 = new Composite("子节点1");
        subroot1.addComposite(leaf1);
        subroot1.addComposite(leaf2);

        Composite subroot2 = new Composite("子节点2");
        subroot2.addComposite(leaf3);
        subroot2.addComposite(leaf4);

        BaseComponent root = new Composite("根节点");
        root.addComposite(subroot1);
        root.addComposite(subroot2);

        root.operation();

    }


}
