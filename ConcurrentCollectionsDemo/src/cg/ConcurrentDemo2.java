package cg;
import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.*;
public class ConcurrentDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConcurrentMap<Integer,String> cm=new ConcurrentHashMap<>();

		//ConcurrentMap<Integer,String> cm=new ConcurrentSkipListMap<>();//sort element by keys
		//comparator object can be passed in a constructor to change sorting
		Comparator<Integer>c =(n1,n2)->n1>n2?-1:n1<n2?1:0;
	ConcurrentMap<Integer,String> cm=new ConcurrentSkipListMap<>(c);
		
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
//		Set<String> cset=ConcurrentHashMap.newKeySet();//generating Concurrent set since there is no special class
//		cset.add("Ram");
//		cset.add("Sham");
//		System.out.println("Concurrent Set "+cset);
	}

}
