import java.util.Scanner;
class Main
{
  	public static int sum(int n)
    {
      int i,sum=0;
      for(i=0;i<=n;i++)
        sum+=i;
      return sum;
    }
	public static void main (String[] args)
    {
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(sum(n));
	} 
}