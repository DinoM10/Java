import java.util.LinkedList;
import java.util.Queue;

public class Queuess {

	public static void main(String[] args) {

		Queue<String> bbq = new LinkedList<String>();
		bbq.add("Jackson");
		bbq.add("Susan");
		bbq.add("Tyreek"); 
		
		bbq.poll();

		System.out.println(bbq);
		
	}

}
