package text;
import java.util.Scanner;

public class SumArray2 {

	public static void main(String[] args) {
		Scanner inp= new Scanner (System.in);
		System.out.println("enter the size of an array: ");
		int n= inp.nextInt();
		int sum=0;
		int arr[]= new int[n];
		for (int i=0; i<n; i++) {
			System.out.println("enter the elements of array "+(i+1)+":");
			arr[i]= inp.nextInt();
		}
		for (int i=0; i<n; i++) {
			System.out.println(sum);
		}
        sum = sum + arr[n];
        System.out.println("the sum of the array is: ");
	}

}
