import java.util.*;
public class paraFunction{
	public static int calculateSum(int num1 ,int num2){
     int sum=num1+num2;
     return sum;
	}
    
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter value of a And b:");
    	int a=sc.nextInt();
    	int b =sc.nextInt();
    	int result = calculateSum(a,b);
    	System.out.println("Sum is " + result);
    }

}