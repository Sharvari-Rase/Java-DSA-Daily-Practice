//print sum of first n natu

import java.util.*;
public class sumno
{
    public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    //System.out.println("Enter Numbers:");
int n=5678;
   while(n>0) 
   {
   int  lastdigit= n%10; 
    System.out.print(lastdigit);
    n =n/10;
   

   } 
   
}
   }