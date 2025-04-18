package text;

public class parameterized {
	String name;
	Parameterized (String n){
		System.out.println("constructor called: ");
		
	}

	public static void main(String[] args) {
		parameterized obj= new parameterized("ECS");
		System.out.println("The name is "+obj.name);

	}

}
