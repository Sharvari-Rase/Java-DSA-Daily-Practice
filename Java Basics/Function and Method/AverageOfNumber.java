//Write a Java method to compute the average of three numbers..
import java.util.*;
public class AverageOfNumber{

	public static int avgno(int a ,int b,int c){
	int result=(a+b+c)/3;
	return result;
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int a=sc.nextInt();
	System.out.println("Enter second number:");
	int b=sc.nextInt();
	System.out.println("Enter third number");
	int c=sc.nextInt();
	System.out.println("Average of three number is="+avgno(a,b,c));
	}
}