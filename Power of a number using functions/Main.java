import java.util.*;
class Main{
  public static void main(String args[])
  {
   	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      int m=sc.nextInt();
      System.out.println(power(n,m));
  }
static int power(int n,int m)
{
  int i,p=n;
  for(i=1;i<m;i++)
   p*=n;
  return p;
}
}