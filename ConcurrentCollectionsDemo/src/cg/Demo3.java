package cg;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable3 ob=new MyRunnable3();
		for(int i=1;i<=10;i++) {
			new Thread (ob,"producer").start();
			new Thread (ob,"consumer").start();
		}
	}

}
