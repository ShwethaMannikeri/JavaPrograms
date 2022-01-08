package HackathonTest;

import java.util.Scanner;

public class PrintUniqueWordsInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String[] strarr=str.split(" ");
		int count;
		
		for(int i=0;i<strarr.length;i++) {
			count=1;
			for(int j=i+1;j<strarr.length;j++) {
				if(strarr[i].equalsIgnoreCase(strarr[j])) {
					count++;
								}
			}
			if(count==1)
				System.out.println(strarr[i]);
		}	
	}
}
