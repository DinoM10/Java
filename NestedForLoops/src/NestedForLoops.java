
public class NestedForLoops {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++ ){
			System.out.println("its cold");
		}
		
		String[] colors = {"red", "green", "blue" };
		
		for (int i = 0; i < 3; i++)
			System.out.println(colors[i]);
	
	
	String[][] fancyColors = { 
			{"red", "green", "blue" },       
			{"cyan", "magenta", "tuqouise" }        
	
	};
	
	for(int i= 0; i < 2; i++ ){
		for(int j= 0; j < 2; j++ ){
			System.out.println(fancyColors[i][j]);
		}
	}
	}
}

