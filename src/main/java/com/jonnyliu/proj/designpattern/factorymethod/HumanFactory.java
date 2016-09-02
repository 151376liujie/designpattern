package com.java.learn.factorymethod;


public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> clazz) {
		try {
			return (T) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}
