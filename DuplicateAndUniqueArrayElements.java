package HackathonTest;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateAndUniqueArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter the array Elements ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			while((i+1)<arr.length && arr[i]==arr[i+1]) {
				count++;
				i++;
			}
			if(count==1)
				System.out.println("Unique Element "+arr[i]);
			else
				System.out.println("Duplicate Element " +arr[i] + " Occurence "+ count);
			count=1;
		}

	}

}
