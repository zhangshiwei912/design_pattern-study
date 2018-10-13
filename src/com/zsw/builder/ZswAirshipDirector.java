package com.zsw.builder;

/**
 * zsw牌宇宙飞船构建者
 * @author zhangshiwei
 *
 */
public class ZswAirshipDirector implements AirshipDirector {
	
	private AirshipBuilder airshipBuilder;
	
	public ZswAirshipDirector(AirshipBuilder airshipBuilder) {
		this.airshipBuilder = airshipBuilder;
	}

	@Override
	public Airship createAirship() {
		Engine engine = airshipBuilder.engineBuilder();
		EscapeTower escapeTower = airshipBuilder.escapeTowerBuilder();
		OrbitalModule orbitalModule = airshipBuilder.orbitalModuleBuilder();
		
		Airship airship=new Airship(engine,orbitalModule,escapeTower);
		return airship;
	}

}
