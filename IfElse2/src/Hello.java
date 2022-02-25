import java.util.Scanner;

public class Hello {

	public static void main (String[] args) {

		// if statements
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		System.out.println(age);
		if (age >= 18) 
		{
			
			System.out.println("I'm an adult");
			
		}
     	else if (age <= 18) {
			System.out.println("I'm not an adult");
		}
		scanner.close();
	}
}
