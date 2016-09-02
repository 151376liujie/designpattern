package com.jonnyliu.proj.designpattern.abstractfactory;

/**
 * 生产女人的工厂
 * 
 * @author Administrator
 * 
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createBlackMan() {
		return new BlackFemale();
	}

	@Override
	public Human createYellowMan() {
		return new YellowFemale();
	}

}
