import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int l=s.length();
    int a=l/2;
    String ch=Character.toString(s.charAt(a));
    String[] words=s.split(ch,3);
    s=s.charAt(a)+words[1]+words[0];
    for(int i=0;i<l;i++)
    {
      for(int j=l-1;j>=0;j--)
      {
        if(j>i)
          System.out.print(" ");
        else
          System.out.print(s.charAt(i-j));
      }
      System.out.println();
    }
  }
}