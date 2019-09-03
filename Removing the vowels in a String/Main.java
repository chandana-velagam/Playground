import java.util.Scanner;
public class Main
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     int l=s.length();
     char ch[]=new char[l];
     int k=0;
     for(int i=0;i<l;i++)
     {
       char c=s.charAt(i);
       if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'))
        ch[k++]=c;
     }
     for(int i=0;i<k;i++)
       System.out.print(ch[i]);
   }
}
       