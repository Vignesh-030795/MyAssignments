package week1.day2;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=12345;
		int output=0;
		int rem;
		
		for (int i=input;i>0;i=i/10) {
			rem= i%10;
			output=(output*10)+rem;
			System.out.println(" output " +output);
		}
		if (input==output) {
			System.out.println("Number is Palindrome");
			
		}
		else {
			System.out.println("Number is not Palindrome");
		}

	}
}
