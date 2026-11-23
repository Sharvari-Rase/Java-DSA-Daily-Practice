
import java.util.*;
public class PrimeNo{
  public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Number");
 int n =sc.nextInt();
 int div=2;
 while(div<n)
 {
  if(n%div==0){
 System.out.println("Not prime");
   return;
   }
  div++;
 }
  System.out.println("Prime");
}
}

