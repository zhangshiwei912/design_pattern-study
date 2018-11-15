package com.zsw.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregator cma=new ConcreteMyAggregator();
		cma.addObj("aa");
		cma.addObj("bb");
		cma.addObj("cc");
		cma.addObj("dd");
		
		MyIterator iterator = cma.createIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.getCurrentObj());
			iterator.next();
		}
	}
}
