import java.util.*;
public class SumOfDigit {
    public static int sum(int n){
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;

        }

        return sum;
    }
    public static void main(String args[])
   {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number");
    int n=sc.nextInt();
    System.out.println("Sum of Digit = "+sum(n));
   }    
}
