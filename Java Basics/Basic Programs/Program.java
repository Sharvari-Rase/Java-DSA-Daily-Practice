//:Write a program to print the multiplication table of a number N,entered by the user

import java.util.*;
public class Program{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number :");
       int num = sc.nextInt();
      
    
         for(int i =1;i<=10;i++)
         {
           int mul =num;
           mul*=i;
            System.out.println(mul);
            
         }

    }
}