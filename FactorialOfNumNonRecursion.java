package HackathonTest;

import java.util.Scanner;

public class FactorialOfNumNonRecursion {
	
	
	public static void nonRecurssionFactorial (int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of the given number is: "+fact);
	}
	
		public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find factorial :");
		int n=sc.nextInt();
	 nonRecurssionFactorial(n);
	}

}
