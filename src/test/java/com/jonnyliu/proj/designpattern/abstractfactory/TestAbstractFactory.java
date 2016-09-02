package com.java.learn.abstractfactory;

import org.junit.Test;

public class TestAbstractFactory {

	@Test
	public void testAbstractFactory() {
		AbstractHumanFactory femalehumanFactory = new FemaleHumanFactory();
		Human blackMan = femalehumanFactory.createBlackMan();
		Human yellowMan = femalehumanFactory.createYellowMan();
		blackMan.talk();
		blackMan.getColor();
		blackMan.getSex();

		yellowMan.talk();
		yellowMan.getColor();
		yellowMan.getSex();

		AbstractHumanFactory malehumanFactory = new FemaleHumanFactory();
		Human maleBlackHhuman = malehumanFactory.createBlackMan();
		Human maleYellowHuman = malehumanFactory.createYellowMan();
		maleBlackHhuman.talk();
		maleBlackHhuman.getColor();
		maleBlackHhuman.getSex();

		maleYellowHuman.talk();
		maleYellowHuman.getColor();
		maleYellowHuman.getSex();

	}
}
