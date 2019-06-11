import java.io.*;
import java.lang.*;
import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n,rem,res=0;
        n=m;
        while(n>0)
        {
            rem=n%10;
            res+=Math.pow(rem,3);
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
