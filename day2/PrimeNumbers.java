package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		for (int i = 2; i<n; i++) {
			if(n%i == 0) {
				System.out.println("Not a Prime Number");
				return;
			}
			
		}
		System.out.println("Prime Number");
			
			
	
	}

}
