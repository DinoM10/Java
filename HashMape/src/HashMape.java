import java.util.HashMap;

public class HashMape {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		int c = 88;
		
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 88);

		
		System.out.println(happy);
		System.out.println(happy.get("c"));
		
		
		HashMap <String, String> fun= new HashMap <String, String> ();
		fun.put("bobbyJoe1996", "password123");
		fun.put("joe", "password321");
		fun.remove("joe");	
		System.out.println(fun.containsKey("password123"));
		System.out.println(fun);
		
		
	}

}
