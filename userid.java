import java.util.*;
class userid
{
    public static void main(String... args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String str1=s.next();
        int d=s.nextInt();
        int n=s.nextInt();
        int len=str.length();
        int len1=str1.length();
        List<String> al=new ArrayList<>();
        String sarr[]=new String[2];
        String s1,s11="";
        if(len==len1)
        {
            sarr[0]=str;
            sarr[1]=str1;
            Arrays.sort(sarr);
            String strr=sarr[0];
            String strr1=sarr[1];
            int le=strr.length();
            s1=strr.substring(le-1,le);
            s11=strr1;
            //break;
        }
        else if(len>len1)
        {
             s1=str1.substring(len1-1,len1);
             s11=str;
        }
        else
        {
            s1=str.substring(len-1,len);
            s11=str1;
        }
        String s2=String.valueOf(d);
        int len3=s2.length();
        char s3=s2.charAt(n-1);
        char s4=s2.charAt(len3-n);
        String st;
        String res=s1+""+s11+""+s3+""+s4;
        for(int i=0;i<res.length();i++)
        {
            char c=res.charAt(i);
            if(c>='A' && c<='Z')
            {
                st=Character.toString(c);
                al.add(st.toLowerCase());
            }
            else
            {
                st=Character.toString(c);
                al.add(st.toUpperCase());
            }
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i));
        }
    }
}




