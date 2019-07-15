
class Human {
	
//	Intance variables (data or "state")
	String name;
	int age;
	
	
	/* Classes can contain:
		
		1. Data
		2. Subroutines (methods)
		
		*/


	void speak() {
		
		System.out.println("Hello, My name is " + name + " and I am " + age + " years old." );
	}
}

public class Person {

	public static void main(String[] args) {
		
		Human human1 = new Human();
		human1.name = "Ruby";
		human1.age = 25;
		human1.speak();
		System.out.println("Human Attributes");
		System.out.println(human1.name);
		System.out.println(human1.age);
	}

}
