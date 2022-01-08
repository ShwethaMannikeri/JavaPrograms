package HackathonTest;

public class StringToIntAndIntToString {
	
	    public static void main(String[] args){

	        String str="300";
	        System.out.println("Before converting to Int value " +(str+200));
	        int i=Integer.parseInt(str);
	        System.out.println("After converting to Int "+(i+200));
	        str=String.valueOf(i);
	        System.out.println("Again converting to String "+(str+200));

	    }
}

