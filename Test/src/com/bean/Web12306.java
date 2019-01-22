package com.bean;

public class Web12306 implements Runnable {

	int count=100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(count<0) {
				break;
			}
			count--;
			System.out.println(Thread.currentThread().getName()+"-->"+count);
		}
		
	}
	public static void main(String[] args) {
		Web12306 web12306 = new Web12306();
		Thread t1 =new Thread(web12306,"线程1号");
		Thread t2 =new Thread(web12306,"线程2号");
		Thread t3 =new Thread(web12306,"线程3号");
		t1.start();
		t2.start();
		t3.start();
	}
}
