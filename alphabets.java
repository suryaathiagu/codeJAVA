import java.io.*;
import java.util.*;
import java.lang.*;
class alphabets
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       int i,len=5;
       int t[]=new int[5];
       for(i=0;i<5;i++)
       {  
           int k;
          k=s.nextInt();
          if(k!=-1)
          {
              t[i]=k;
          }else
          {
              i=len;
              break;
          }
       }
       int min=t[0],max=t[0];
       int tot=0;
       double avg=0;
       for(int j=0;j<len;j++)
       {
           if(max<t[j])
           {
               max=t[j];
           }
           if(min>t[j])
           {
               min=t[j];
           }
           tot=tot+t[j];
       }
       avg=tot/5;
       System.out.print(min+" "+max+" "+tot+" ");
       System.out.printf("%.5f",avg);
    }
}
//input:10 20 30 40 50 -1
//output:10 50 150.0 30.00000






