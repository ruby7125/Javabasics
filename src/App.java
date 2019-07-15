
class Frog {
	private String name;
	private int age;
	
	public void setName(String newName) {				//set method
		name = newName;
		
	}
	
	public void setAge(int newAge) {					//set method
		age = newAge;
	}
	
	public String getName() {							//get method
		return name;
	}
	
	
	public int getAge() {								//get method
		return age;
	}
}


public class App {

	public static void main(String[] args) {

		Frog frog1 = new Frog();
		frog1.setName("Ruby");
		frog1.setAge(25);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());

	}

}
