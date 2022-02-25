import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade");
		
		int n = scan.nextInt();
	if(n >= 90 && n <= 100){
		System.out.println("A");
		 }
	
		else if (n<=90) {
		System.out.println("B");
	}
		
	}

}
