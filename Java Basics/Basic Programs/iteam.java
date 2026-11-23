import java.util.*;
public class iteam{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
              
        System.out.println("Pencile price:");
        float pencile =sc.nextFloat();
       

        System.out.println("Pen price:");
        float pen =sc.nextFloat();
    

        System.out.println("Ereser:");
        float ereser  = sc.nextFloat();
    
        float total = pencile+pen+ereser;

        //Add GST 
        float gst = total*0.18f;
        float finalbill = total+ gst;

        System.out.println("Total Bill  :"+total);
        System.out.println("Bill after 18%gst:"+finalbill);
        
    }
}