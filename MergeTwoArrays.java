package HackathonTest;
import java.util.Scanner;

public class MergeTwoArrays {
	
		static void mergeArray(int[] arr1,int[] arr2) {
		int i=0,j=0,k=0;
		int[] mergedArr=new int[arr1.length+arr2.length];
		
		for(i=0;i<arr1.length;i++) {
			mergedArr[k]=arr1[i];
			k++;
		}
		for(j=0;j<arr2.length;j++) {
			mergedArr[k]=arr2[j];
			k++;
		}
		System.out.println("Merged Array: ");
	for(int l:mergedArr)
		System.out.print(l+" ");
	}
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First array size: ");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		System.out.println("Enter the first Array");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the Second array size: ");
		int n1=sc.nextInt();
		int[] arr2=new int[n1];
		System.out.println("Enter the Second Array");
		for(int i=0;i<n1;i++) {
			arr2[i]=sc.nextInt();
		}
		mergeArray(arr1,arr2);
	}
}
