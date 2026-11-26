 import java.util.*;

public class MathFunctions {
    public static void math(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a = ");
        double a=sc.nextDouble();
        System.out.println("Enter value of b = ");
        double b=sc.nextDouble();
        System.out.println("Maximum number = "+Math.max(a,b));
        System.out.println("Minimum number = "+Math.min(a,b));
        System.out.println("Power = "+Math.pow(a,b));
        System.out.println("Absoulte value = "+Math.abs(a));
        System.out.println("Square Root = "+Math.sqrt(a));
        System.out.println("Round the number = "+Math.round(a));
        System.out.println("ceil  number = "+Math.ceil(a));
        System.out.println("Floor number = "+Math.floor(a));

        sc.close();
    }
    public static void main(String args[]){
    math();
    }
}