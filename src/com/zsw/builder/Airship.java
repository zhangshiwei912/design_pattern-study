package com.zsw.builder;

/**
 * 宇宙飞船类
 * @author zhangshiwei
 *
 */
public class Airship {
	private Engine engine;
	private OrbitalModule orbitalModule;
	private EscapeTower escapeTower;
	
	
	
	public Airship() {
	}

	public Airship(Engine engine, OrbitalModule orbitalModule, EscapeTower escapeTower) {
		this.engine = engine;
		this.orbitalModule = orbitalModule;
		this.escapeTower = escapeTower;
	}
	
	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}



	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}



	public EscapeTower getEscapeTower() {
		return escapeTower;
	}



	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}

	public void luanch() {
		System.out.println("点火发射");
	}

	
	
}
