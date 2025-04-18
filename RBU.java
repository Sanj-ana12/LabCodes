package text;

public class RBU {
	String name;
	RBU(){
		System.out.println("constructor called: ");
		name="ECS";
	}

	public static void main(String[] args) {
		RBU r1= new RBU();
		System.out.println("The name is "+r1.name);

	}

}
