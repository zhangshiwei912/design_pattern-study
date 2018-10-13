package com.zsw.builder;

/**
 * 宇宙飞船构建者接口
 * @author zhangshiwei
 *
 */
public interface AirshipBuilder {
	Engine engineBuilder();
	EscapeTower escapeTowerBuilder();
	OrbitalModule orbitalModuleBuilder();
}
