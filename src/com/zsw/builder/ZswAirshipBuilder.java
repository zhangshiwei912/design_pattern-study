package com.zsw.builder;

/**
 * zsw牌宇宙飞船建造者
 * @author zhangshiwei
 *
 */
public class ZswAirshipBuilder implements AirshipBuilder {

	@Override
	public Engine engineBuilder() {
		System.out.println("构建发动机");
		return new Engine("zsw牌发动机");
	}

	@Override
	public EscapeTower escapeTowerBuilder() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("zsw牌逃逸塔");
	}

	@Override
	public OrbitalModule orbitalModuleBuilder() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("zsw牌轨道舱");
	}

}
