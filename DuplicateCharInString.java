package HackathonTest;

import java.util.Scanner;

public class DuplicateCharInString {
		
	    public static void main(String[] args){
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the String: ");
	        String str=sc.nextLine();
	       char[] arr=str.toCharArray();	
	        System.out.println("Duplicate Characters are :");
	       int count;
	        for(int i=0;i<arr.length;i++){
	        	count=1;
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[i]==arr[j]){
	                	count++;
	                }  
	        }
	      	if(count>1)
	      		System.out.print(arr[i]+" ");
	   }
    }
}
