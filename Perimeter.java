package text;
import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the radius: ");
		 double radius, perimeter;
		 radius= scanner.nextDouble();
		 perimeter= 2*Math.PI*radius;
		 System.out.println("perimeter of circle "+perimeter);
		 scanner.close();

	}

}
