import java.util.Stack;

public class Stackss {

	public static void main(String[] args) {

		Stack<String> games = new Stack <String>();
		
		games.add("Call of duty");
		games.add("Guitar hero");
		games.add("Fifa");
		
		System.out.println(games.pop());
		System.out.println(games.pop());
		System.out.println(games);
		
		
		Stack<Character> tower = new Stack<Character>();
		tower.add('r');
		tower.add('b');
		tower.add('y');
		System.out.println(tower);
	}

}
