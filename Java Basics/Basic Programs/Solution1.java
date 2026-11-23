public class Solution1
{
    public static void main(String args[])
    {
       
       int oddsum=0;
       int evensum=0;

        for(int i=1; i<10;i++)
        {
           
            if(i%2==0)
            {
            evensum+=i;
           
            }
            else
            {
                oddsum+=i;
               
            }

        }
        System.out.println("even  "+evensum);
        System.out.println("odd  "+oddsum);
    }
}