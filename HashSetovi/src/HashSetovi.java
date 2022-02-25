import java.util.HashSet;
import java.util.Iterator;

public class HashSetovi {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		h.add("jedan");
		h.add("dva");
		h.add("tri");
		
		System.out.println(h);
		
		
		HashSet<Integer> hb = new HashSet<Integer>(); 
		hb.add(13);
		hb.add(24);
		hb.add(5);
		
		Iterator<Integer> it = hb.iterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
			
		}
		
		Object[] r = hb.toArray();
		System.out.println(r[0]);
	}

}
