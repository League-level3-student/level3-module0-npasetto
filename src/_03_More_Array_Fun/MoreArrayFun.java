package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	static Random rand=new Random();
	public static void main(String[] args) {
		String[] strings= {"thing","thing2","thing3","thing4"};
		print(strings);
		reversePrint(strings);
		doublePrint(strings);
		randomPrint(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void print(String[] strings) {
		for (String string : strings) {
			System.out.println(string);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reversePrint(String[] strings) {
		for (int i = strings.length-1; i >=0; i--) {
			System.out.println(strings[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void doublePrint(String[] strings) {
		for (int i = 0; i <strings.length; i+=2) {
			System.out.println(strings[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomPrint(String[] strings) {
		ArrayList<String> stringList=new ArrayList<String>();
		for (int i = 0; i <strings.length; i++) {
			stringList.add(strings[i]);
		}
		for (int i = 0; i <strings.length; i++) {
			int random=rand.nextInt(stringList.size());
			System.out.println(stringList.get(random));
			stringList.remove(random);
		}
	}
	
}
