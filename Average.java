package lab1;

import java.util.Scanner;

public class Average {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Insput 1st number: ");
		int num1=sc.nextInt();
		System.out.print("Insput 2nd number: ");
		int num2=sc.nextInt();
		System.out.print("Insput 3rd number: ");
		int num3=sc.nextInt();
		System.out.print("Insput 4rd number: ");
		int num4=sc.nextInt();
		System.out.print("Insput 5th number: ");
		int num5=sc.nextInt();
		
		System.out.println("Average of 5 number is: "+
		(num1 + num2 + num3 + num4 +num5 ) / 5);
	}
	

}
