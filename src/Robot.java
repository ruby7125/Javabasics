
class Params {
	
	public void speak(String text) {
		System.out.println(text);
		
	}
	
	public void jump(int height) {
		System.out.println("Jumping " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " metres in " + direction);
	}
}

public class Robot {

	public static void main(String[] args) {

		Params sam = new Params();
		sam.speak("Hi, I am Sam");
		
		String greeting = "Hello Coders";
		sam.speak(greeting);  
		sam.jump(120);
		sam.move("North", 274.77);
	}

}
