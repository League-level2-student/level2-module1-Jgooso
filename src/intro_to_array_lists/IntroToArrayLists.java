package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("1");
		array.add("2");
		array.add("3");
		array.add("4");
		array.add("hello");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < array.size();i++) {
			System.out.print(array.get(i));
		}
		System.out.println();
		//4. Print all the Strings using a for-each loop
		for(String n: array) {
			System.out.print(n);
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < array.size(); i+=2) {
			System.out.print(array.get(i));
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for(int i = array.size()-1; i >= 0;i--) {
			System.out.print(array.get(i));
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for(String n: array) {
			if(n.contains("e")) {
			System.out.print(n);
			}
		}
	}
}
