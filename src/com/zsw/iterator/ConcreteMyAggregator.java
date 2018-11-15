package com.zsw.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的数据收集类
 * @author zhangshiwei
 *
 */
public class ConcreteMyAggregator {
	private List<Object> list=new ArrayList<Object>();
	
	public void addObj(Object obj) {
		this.list.add(obj);
	}
	
	public void removeObj(Object obj) {
		this.list.remove(obj);
	}
	
	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	public MyIterator createIterator() {
		return new ConcreteIterator();
	}
	
	private class ConcreteIterator implements MyIterator  {
		private int cursor;
		@Override
		public void first() {
			cursor=0;
		}

		@Override
		public void next() {
			if(cursor<list.size()) {
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			return cursor<(list.size())?true:false;
		}

		@Override
		public boolean isFirst() {
			return cursor==0?true:false;
		}

		@Override
		public boolean isLast() {
			return cursor==list.size()-1?true:false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
	}
}
