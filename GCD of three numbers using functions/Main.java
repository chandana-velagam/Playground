import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	     Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
      n1=gcd(n1,n2);
      n1=gcd(n1,n3);
      System.out.println(n1);
    }
  static int gcd(int x,int y)
  {
    int i,gcd=0,min;
    if(x>y)
      min=y;
    else
      min=x;
    for(i=1;i<=min;i++)
      if(x%i==0 && y%i==0)
        gcd=i;
    return gcd;
  }
}