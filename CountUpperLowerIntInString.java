package HackathonTest;
import java.util.Scanner;

public class CountUpperLowerIntInString {
                 public static void main(String[] args){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String: ");
            String str=sc.nextLine();
            int upper=0,lower=0,integer=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                    upper++;
                }
                else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                    lower++;
                }
                else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    integer++;
                }
            }
            System.out.println("Number of Upper Case letters are: "+upper);
            System.out.println("Number of Lower Case letters are: "+lower);
            System.out.println("Number of Integers are: "+integer);
        }
}
