
public class ArrayStrings {

	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"Apple", "Banana", "Dragon fruit", "Kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}

		
		String text = null;
		System.out.println(text);
		
		String[] texts = new String[2];
		System.out.println(texts[1]);
	}

}
