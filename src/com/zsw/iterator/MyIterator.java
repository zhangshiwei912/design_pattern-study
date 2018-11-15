package com.zsw.iterator;

/**
 * 迭代器接口
 * @author zhangshiwei
 *
 */
public interface MyIterator {
	void first();// 将游标指向第一个元素
	void next();// 将游标指向下一个元素
	boolean hasNext();// 是否有下一个元素
	
	boolean isFirst();// 是不是第一个元素
	boolean isLast();// 是不是最后一个元素
	
	Object getCurrentObj();// 获取当前游标指向的元素
}
