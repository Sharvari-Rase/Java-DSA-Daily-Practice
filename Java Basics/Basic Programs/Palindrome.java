public class Palindrome{
public static void main(String args[])
{
int original=21;
int reverse=0;
int n=original;

if(original<0)
{
System.out.print("false");
return;
}
while(n!=0)
{
int digit = n%10;
reverse=reverse*10+digit;
n = n/10;
}
if(reverse==original)
{
System.out.print("true");
}
else
{
System.out.print("False");
}
}
}
