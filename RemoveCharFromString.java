package HackathonTest;

import java.util.Scanner;

public class RemoveCharFromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		System.out.println("Enter the char to remove :");
		String ch=sc.next();
		replaceChar(str,ch);

	}
	
	public static void replaceChar(String str, String ch) {
		
		
				String newString = "";
				for(int i=0;i<str.length();i++) {
	        newString = str.substring(0, str.indexOf(ch))+""+str.substring(str.indexOf(ch)+1);
				}
	        System.out.println(newString); 
		}
}
