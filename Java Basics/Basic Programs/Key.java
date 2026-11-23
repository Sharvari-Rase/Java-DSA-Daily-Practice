// Display all the numbers entered by user except multiples of 10

import java.util.*;
public class Key
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter number");
            int n=sc.nextInt();
            
        if(n%10==0)
        {
            break;
        }

        System.out.println("num has"+n);
        }while(true);
            
    }
}