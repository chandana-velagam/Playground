import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int dup=n,len=0;
    if(dup<0)
    {  dup*=-1; len++;}
  while(dup>0)
  {
    dup/=10;
    len++;
  }
    char ch[]=new char[len];
    int k=0;
    dup=n;
    if(dup<0)
    {dup*=-1; k++; ch[0]='-';}
    k=0;
    while(dup>0)
    {
      int a='0'+dup%10;
     ch[len- ++k]=(char)a;
      dup/=10;
    }
    System.out.println(ch);
  }
}
    