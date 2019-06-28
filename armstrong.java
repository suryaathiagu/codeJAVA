import java.io.*;
import java.lang.*;
import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        String str=String.valueOf(m);
        int len=str.length();
        int n,rem,res=0;
        n=m;
        while(n>0)
        {
            rem=n%10;
            res+=Math.pow(rem,len);
            n=n/10;
        }
        if(res==m)
        {
            System.out.print(n+" is an Armstrong");
        }
        else
        {
             System.out.print(n+" is not an Armstrong");
        }
    }
}
