
public class Main2 {

	public static void main(String[] args) {

		MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,2);
		MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,3.122);
		MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@','w');
		MyGenericClass <String, String>myString = new MyGenericClass<>("Hello","nfos");

			
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());

	}

}
