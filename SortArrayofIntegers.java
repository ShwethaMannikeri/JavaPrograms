package HackathonTest;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayofIntegers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size:");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Sorted Array elements are ");
		for(int i:arr)
			System.out.print(i+" ");
	}

}

