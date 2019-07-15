
class classHuman {

	int age;
	String name;
	

	void speak() {
		
		System.out.println("Hello, My name is " + name + " and I am " + age + " years old." );
	}
	
	void calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		System.out.println( "Years left for retirement " + yearsLeft);
	}
	
	int calculateYearsToBuyABMW() {
		int luckTime = 30 - age;
		
	return luckTime;
	}
	
	int getAge() {			// Getter method
		return age;
	}
}




public class classPerson {

	public static void main(String[] args) {
		
		classHuman human1 = new classHuman();
		human1.name = "Ruby";
		human1.age = 25;
//		human1.speak();
		human1.calculateYearsToRetirement();
		
		int years = human1.calculateYearsToBuyABMW();
		System.out.println( years + " years left to buy a BMW");
		
		int age = human1.getAge();
		System.out.println(age);
	}

}
