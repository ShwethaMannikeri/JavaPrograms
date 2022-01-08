package HackathonTest;

import java.util.Scanner;

public class DeferentiateIntStringBoolean {

	
	static boolean isNumber(String s) {
		for(int i=0;i<s.length();i++) 
			if(Character.isDigit(s.charAt(i))==false)
				return false;
			return true;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input: ");
		String s=sc.nextLine();
		if(isNumber(s))
			System.out.println("Interger");
		else if(s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false"))
			System.out.println("Boolean");
		else
			System.out.println("String");

	}

}
