package text;
public class NSMethod{
	public static int addNumbers(int a, int b) {
		a=50;
		b=67;
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		int result = addNumbers(50,67);
		System.out.println("the sum is: "+result);
	}
}