package HackathonTest;

import java.util.Scanner;

public class ReverseStringWords {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String[] strarr=str.split(" ");
		for(int i=strarr.length-1;i>=0;i--)
			System.out.print(strarr[i]+" ");
	}

}
