package text;

public class SumArrayE1 {

	public static void main(String[] args) {
		int[] arr= new int[] {1,2,3,4,5};
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			sum =sum + arr[i];
		}
		System.out.println("the sum of the array is: "+sum);

	}

}
