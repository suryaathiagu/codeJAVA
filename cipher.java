import java.util.*;
class cipher
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int len=str.length();
        String str1="";
        char arr[]=new char[len];
        
        for(int i=0;i<len;i++)
        {
            arr[i]=str.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=len-1;i>=0;i--)
        {
            str1+=arr[i];
        }
        char arr1[]=str1.toCharArray();
        for(int i=0;i<len;i++)
        {
            int count=0;
            for(int j=i+1;j<len;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    count++;
                    i=i+1;
                }
            }
            
        count=count+1;
                System.out.print(arr1[i]+""+count);
            
        }
    }
}


