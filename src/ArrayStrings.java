
public class ArrayStrings {

	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[1] = "Hello";
		words[2] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"Apple", "Banana", "Dragon fruit", "Kiwi"};
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}

		int value = 0;
		String text = null;
		System.out.println(text);
		
		String[] texts = new String[2];
		System.out.println(texts[1]);
	}

}
