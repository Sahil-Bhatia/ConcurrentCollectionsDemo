package cg;
import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String,String> hm=new ConcurrentHashMap<>();

		//ConcurrentMap<Integer,String> cm=new ConcurrentSkipListMap<>();//sort element by keys
		//comparator object can be passed in a constructor to change sorting
		//Comparator<Integer>c =(n1,n2)->n1>n2?-1:n1<n2?1:0;
		//ConcurrentMap<Integer,String> cm=new ConcurrentSkipListMap<>(c);
		
		hm.put("G", "Delhi");
		hm.put("F", "Hyderabad");
		hm.put("E", "Pune");
		hm.put("D", "Mumbai");
		hm.put("C","Patiyala");
		hm.put("B","Panjim");
		hm.put("A","Chennai");
		hm.put("B","Pen");
		hm.put("H","Kokan");
		hm.put("J","Bihar");
		hm.put("I","Pavan");
		
		
		hm.forEach(2,(key,value)->System.out.println(key+" : "+value+" by thread "+Thread.currentThread().getName()));;
		String res1=hm.search(2,(key,value)->value.startsWith("P")?"P "+key+" "+value+" by thread "+Thread.currentThread().getName():null);
		System.out.println(res1);
		Integer res2=hm.reduce(2,(key,value)->value.length(),(value1,value2)->Integer.max(value1,value2));
		System.out.println(res2);
	}

}
