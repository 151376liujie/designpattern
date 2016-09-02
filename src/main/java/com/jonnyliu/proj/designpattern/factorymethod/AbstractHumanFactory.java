package com.java.learn.factorymethod;


/**
 * 相当于制造人的"八卦炉",充当"工厂"的角色
 * 
 * @author Administrator
 * 
 */
public abstract class AbstractHumanFactory {

	public abstract <T extends Human> T createHuman(Class<T> clazz);
}
