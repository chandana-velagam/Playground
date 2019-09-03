import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    int j;
      for( j=0;j<s1.length();j++)
      {
        int count=0;
       
        for(int i=0;i<s2.length();i++)
        {
          if(s1.charAt(j)==s2.charAt(i))
             count++;
        }
             if(count==0)
             System.out.print(s1.charAt(j));
      }
  }
}