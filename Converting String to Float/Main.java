import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    float f=0,fp=0;
    int len=str.length();
    int check=0;
    for(int i=0;i<len;i++)
    {
      if(str.charAt(i)=='.' )
      {
        check=1;
        continue;
      }
      else if(check>0)
      {
        float k=str.charAt(i)-'0';
        for(int j=0;j<check;j++)
          k/=10;
        fp+=k;
        check++;
      }
      else
      f=f*10+str.charAt(i)-'0';
    }
    f+=fp;
    System.out.println(f);
  }
}