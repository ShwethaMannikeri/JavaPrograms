package HackathonTest;
import java.util.Arrays;
import java.util.Scanner;

public class OccuranceOfAllCharacters {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String: ");
			String str=sc.nextLine();
			int count=1;
			char[] strarr=str.toCharArray();
			Arrays.sort(strarr);
			System.out.println("Occurance of Elements: ");
			for(int i=0;i<strarr.length;i++) {
				while((i+1)<strarr.length && strarr[i]==strarr[i+1]) {
					count++;
					i++;
				}
				System.out.print(strarr[i]+ "-"+count+ "    ");
				count=1;
			}

		}
}

