package HackathonTest;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int num=n;
		int r,revnum=0;
		while(n>0) {
			r=n%10;
			revnum=(revnum*10)+r;
			n=n/10;
		}
			if(num==revnum)
				System.out.println("Palindrome Number");
			else
				System.out.println("Not a Palindrome Number");
	}

}
