//Find the product of a & b

import java.util.*;
public class product{

	public static int mul(int num1,int num2){
		int result=num1*num2;
		return result;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		
		int Result1 =mul(a,b);
		System.out.println("a*b="+Result1);
		
		int Result2=mul(20,10);
		System.out.println("a*b="+Result2);

	}
}