package cg;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable2 ob=new MyRunnable2();
		for(int i=1;i<=10;i++) {
			new Thread (ob,"producer").start();
			new Thread (ob,"consumer").start();
		}
	}

}
