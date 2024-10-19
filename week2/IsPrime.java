package HomeAssignments.week2;

public class IsPrime {
	
	public boolean isPrimeNumber(int number) {
		for(int i=2; i<=number-1; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		int number = 13;
		IsPrime p = new IsPrime();
		
		if(p.isPrimeNumber(number)) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}

	}

}