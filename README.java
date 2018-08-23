import java.io.*;
import java.util.*;
  public class Armstrong_Interval
  {
    public static void main(String args[])
    {
      int New_value,Store_value=0,temp,Count=0;
      Scanner sc=new Scanner(System.in);
      int Initial_value=sc.nextInt();
      int Final_value=sc.nextInt();
         temp=Initial_value;
        
        if(Initial_value<Final_value)
        {
          System.out.println(+Initial_value+" To "+Fina_value+" Between Armstrong Numbers are:");
      
            for(int value=Initial_value;value<=Final_value;value++)
              {
        
                  while(value>0)
                  {
                   New_value=value%10;
                   Store_value=Store_value+(New_value*New_value*New_value);
                   value=value/10;
                   }
        
                   if()Store_value==temp)
                   {
                     Count=Count+1;
                     System.out.println(+Count+"."+Store_value+);
                   }
              }
        }
    }    
 }       
