package week1.day2;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int num3=1;
		System.out.println(num1);
		for (int i=1; i<=10; i++) {
			System.out.println(num3);
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
		}

	}

}
