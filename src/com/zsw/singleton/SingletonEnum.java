package com.zsw.singleton;

/**
 * 单例模式--枚举式
 * @author zhangshiwei
 *
 */
public enum SingletonEnum {
	/* 此枚举对象即单例对象，线程安全，但不能延时加载，可以天然的防止反射和反序列化漏洞 */
	INSTANCE;
}
