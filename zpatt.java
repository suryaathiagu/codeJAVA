import java.util.*;
import java.lang.*;

class zpatt
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==p || i==1 || i==n)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            p--;
            System.out.println();
        }
    }
}

/*12345
   4 
  3  
 2   
12345
*/
