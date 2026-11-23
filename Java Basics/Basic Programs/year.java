import java.util.*;
public class Year
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
        System.out.println(" leap year");
        }
        else{
        System.out.println("Not leap year");
        }
    }
}
/*Leap year चा logic step by step बघू.

Rule 1

जर year 4 ने divide होत असेल → leap year असू शकतो.

Example:

2024 ÷ 4 ✔️
Rule 2

पण जर year 100 ने divide होत असेल → leap year नसतो.

Example:

1900 ÷ 100 ✔️
म्हणून normally leap year नाही ❌
Rule 3 पण जर तो year 400 ने पण divide होत असेल → पुन्हा leap year होतो.

Example:

2000 ÷ 400 ✔️
म्हणून leap year ✅ */