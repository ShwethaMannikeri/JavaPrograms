package HackathonTest;

import java.util.Scanner;

public class CheckBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 boolean values ");
		
		boolean b1=sc.nextBoolean();
		boolean b2=sc.nextBoolean();
		boolean b3=sc.nextBoolean();
		
		if((b1 && b2) || (b1 && b3) || (b2 && b3)) {
			System.out.println("Two boolean values are true");
		}
		else
			System.out.println("No two boolean values are true");
	}

}
