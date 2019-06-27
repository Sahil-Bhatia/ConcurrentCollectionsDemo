package cg;
import java.util.Set;
import java.util.concurrent.*;
public class ConcurrentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentMap<Integer,String> cm=new ConcurrentHashMap<>();
		
		
		cm.put(11, "Ram");
		cm.put(5, "Sham");
		cm.put(22, "Krishna");
		System.out.println(cm);
		String s=cm.putIfAbsent(1,"Devi");
		System.out.println(s);
		System.out.println(cm);
		s=cm.putIfAbsent(11,"Don");
		System.out.println(s);
		System.out.println(cm);
		boolean ch=cm.replace(1, "devi","Durga");
		System.out.println("replaced "+ch);
		System.out.println(cm);
		ch=cm.replace(1, "Devi","Durga");
		System.out.println("replaced "+ch);
		System.out.println(cm);
		boolean rm=cm.remove(22,"Krishna");
		System.out.println("removed "+rm);
		System.out.println(cm);
		Set<String> cset=ConcurrentHashMap.newKeySet();//generating Concurrent set since there is no special class
		cset.add("Ram");
		cset.add("Sham");
		System.out.println("Concurrent Set "+cset);
	}

}
