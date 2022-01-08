package HackathonTest;

import java.util.Scanner;

public class SelectionSort {

	
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int smallint=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[smallint]) {
					smallint=j;
				}
			}
			int smallnum=arr[smallint];
			arr[smallint]=arr[i];
			arr[i]=smallnum;
		}
		System.out.println("Sorted Array: ");
		for(int i:arr)
			System.out.print(i+ " ");
				
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements ");
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		}
		
		selectionSort(arr);

	}

}
