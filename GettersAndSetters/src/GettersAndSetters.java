
public class GettersAndSetters {

	String name;
	int age; 
	
		
	public static void main(String[] args) {
		 
		GettersAndSetters a = new GettersAndSetters();
	
		a.sayHappyBirthday("Alex");
	}
	public static void sayHappyBirthday(String name){
		
		System.out.println("Happy birthday 	" + name);
	}

}
