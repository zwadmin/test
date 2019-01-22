package com.bean;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class demo {
//33333333333333kk
	public static void main(String[] args) {
		ThreadPoolExecutor th =new ThreadPoolExecutor(2, 5, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
		Bank b =new Bank();
		for(int i=0; i<5; i++) {
			//new Thread(b).start();
			th.execute(b);
		}
		
	}
}
 class Bank implements Runnable{
	 int count =10;
	 
	 public synchronized void add() {
		 count++;
		System.out.println(Thread.currentThread().getName()+"count:"+count);
		reduce();
	 }
	 
	 public synchronized void reduce() {
		 count--;
	 }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		add();
	}
	 
 }
 
	 
	 
