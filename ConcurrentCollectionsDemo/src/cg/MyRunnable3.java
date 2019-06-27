package cg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import javax.print.attribute.HashAttributeSet;

public class MyRunnable3 implements Runnable{
//	ArrayList <String> list=new ArrayList<>(); 
//	ArrayList gives concurrent modification exception
//	CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
//	BlockingQueue<String> queue=new ArrayBlockingQueue<>(10);
//	10 is no. of threads simultaneously accessing
//	BlockingQueue<String> queue=new ArrayBlockingQueue<>(5);
//	queue is full //Illegal State Exception
//	BlockingQueue<String> queue=new LinkedBlockingQueue<>(5);
//	Unbounded Size Queue //no exception arise
//	Queue <String> queue=new ConcurrentLinkedQueue<>();
	
	
//	Map<Integer,String>hm=new HashMap<>();
//	ConcurrentMap<Integer,String> hm=new ConcurrentHashMap<>();
	ConcurrentMap<Integer,String> hm=new ConcurrentSkipListMap<>();
	
	
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
	private void add() {
		// TODO Auto-generated method stub
		/*	boolean added=queue.add("Sales "+(++i));// add method throws exception
		System.out.println("added "+added);
	
		try {
			queue.put("Sales "+(++i));//put method doesn't throw exception//only 1-5 is added
			System.out.println("added");
		}catch(InterruptedException e) {e.printStackTrace();}*/
		
		i++;
		String s=hm.put(i, "Sales"+i);
		System.out.println("added "+s);
		
		
	}

	
	private void print() {
		// TODO Auto-generated method stub
		Iterator<Map.Entry<Integer, String>> it=hm.entrySet().iterator();//for more access time
		while(it.hasNext()) {
			Map.Entry<Integer, String> s=it.next();
			System.out.println(s.getKey()+" ,"+s.getValue()+"--");
		}
		System.out.println();
	}

}
