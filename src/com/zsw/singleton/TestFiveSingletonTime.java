package com.zsw.singleton;

import java.util.concurrent.CountDownLatch;

public class TestFiveSingletonTime {
	public static void main(String[] args) throws Exception {
		long begin = System.currentTimeMillis();
		int threadNum=10;
		CountDownLatch countDownLatch=new CountDownLatch(threadNum);
		for(int j=0;j<threadNum;j++ ) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=0;i<1000000;i++) {
//						SingletonHungry instance1 = SingletonHungry.getInstance();//31ms
//						SingletonLazy instance2 = SingletonLazy.getInstance();//172ms
//						SingletonStaticInnerClass instance3 = SingletonStaticInnerClass.getInstance();//26ms
//						SingletonDoubleCheckLock instance4 = SingletonDoubleCheckLock.getInstance();//26ms
						SingletonEnum instance5 = SingletonEnum.INSTANCE;//16ms
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
}
