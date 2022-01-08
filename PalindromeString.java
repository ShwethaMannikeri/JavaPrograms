package HackathonTest;

import java.util.Scanner;

public class PalindromeString {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String:");
	        String str = sc.next();
	        String revstr="";

	        for(int i=str.length()-1;i>=0;i--){
	            revstr=revstr+str.charAt(i);
	        }
	        if(str.toLowerCase().equals(revstr.toLowerCase()))
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	    }
}
