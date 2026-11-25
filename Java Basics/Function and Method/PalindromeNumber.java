
import java.util.*;
public class PalindromeNumber{
   
    public static int reverseNumber(int n){
    int reverse=0;
    int rem=0;

    while(n>0){
     rem=n%10;
     reverse=reverse*10+rem;
     n=n/10;
    }
   return reverse;
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Original Number:") ;
int n= sc.nextInt();

if(n==reverseNumber(n)){
System.out.println("Number is palindrome");
}else{
System.out.println(" Number is not palindrome");

}
}
}