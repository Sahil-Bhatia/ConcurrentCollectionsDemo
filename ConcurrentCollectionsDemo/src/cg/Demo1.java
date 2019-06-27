package cg;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable1 ob=new MyRunnable1();
		for(int i=1;i<=10;i++) {
			new Thread (ob,"producer").start();
			new Thread (ob,"consumer").start();
		}
	}

}
