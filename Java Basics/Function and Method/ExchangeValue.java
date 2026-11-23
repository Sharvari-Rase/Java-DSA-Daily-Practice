import java.util.*;
public class ExchangeValue{
	public static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swaping the value of a="+a);
	    System.out.println("After swaping the value of b="+b);

	}

	public static void main(String args[]){
		int a=10;
		int b=5;

	    swap(a,b);
	}
}