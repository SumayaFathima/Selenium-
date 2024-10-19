package HomeAssignments.week2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range =8;
		int arr[] = new int[range];
		arr[0] =0;
		arr[1] =1;
		
		for(int i = 2; i<range; i++) {			
			arr[i] = arr[i-1] + arr[i-2];			 
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}