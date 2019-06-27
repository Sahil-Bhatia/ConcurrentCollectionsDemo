package cg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyRunnable1 implements Runnable{
	//ArrayList <String> list=new ArrayList<>(); //ArrayList gives concurrent modification exception
	CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
	int i=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String th=Thread.currentThread().getName();
		if(th.equals("producer")) {
			
			add();
			
		}
		if(th.equals("consumer")) {
			print();
		}
	}
	private void print() {
		// TODO Auto-generated method stub
		Iterator<String> it=list.iterator();//for more access time
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s+" ,");
		}
		System.out.println();
	}
	private void add() {
		// TODO Auto-generated method stub
		boolean added=list.add("Sales "+(++i));
		System.out.println("added "+added);
	}

}
