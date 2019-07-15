
class Machine {
	private String name;
	private int code;
	
	public Machine() {
		
		this("Julie", 77);      					// for calling constructor which accept ("Julie", 77) params
		System.out.println("Contructor is running");
	}
	
	public Machine(String name) {
		System.out.println("2nd Cons. is running");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("3rd cons. is running");
		this.name = name;
		this.code = code;
	}
}



public class Constructorclass {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();     // new Machine(); for running constructor
		Machine machine2 = new Machine("Ruby");
		Machine machine3 = new Machine("Julie", 77);
		
	}

}
