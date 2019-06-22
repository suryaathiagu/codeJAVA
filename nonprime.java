import java.util.*;
class nonprime
{
    public static void main(String... args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        //int k=0;
        al.add(0);
        al.add(1);
        for(int i=0;i<n;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    al.add(i);
                    break;
                }
            }
        }
        int sum=0;
        for(int i=0;i<al.size();i++)
        {
            int m=al.get(i);
            sum+=a[m];
        }
        System.out.print(sum);
    }
}
