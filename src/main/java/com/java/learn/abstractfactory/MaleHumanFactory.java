package com.java.learn.abstractfactory;

/**
 * 生产男人的工厂
 * 
 * @author Administrator
 * 
 */
public class MaleHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createBlackMan() {
		return new BlackMale();
	}

	@Override
	public Human createYellowMan() {
		return new YellowMale();
	}

}
