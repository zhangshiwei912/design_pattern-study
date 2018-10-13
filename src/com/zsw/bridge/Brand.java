package com.zsw.bridge;

/**
 * 品牌接口
 * @author zhangshiwei
 *
 */
public interface Brand {
	public void sale();
}

/**
 * 联想品牌
 * @author zhangshiwei
 *
 */
class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("销售联想");
	}
	
}
/**
 * 戴尔品牌
 * @author zhangshiwei
 *
 */
class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("销售戴尔");
	}
	
}