package com.java.learn.factorymethod;

import org.junit.Test;


public class FactoryMethodTest {

	@Test
	public void testFactoryMethod() {
		AbstractHumanFactory humanFactory = new HumanFactory();
		Human whiteMan = humanFactory.createHuman(YellowMan.class);

		Human blackMan = humanFactory.createHuman(BlackMan.class);
		
		whiteMan.talk();
		blackMan.talk();

	}
}
