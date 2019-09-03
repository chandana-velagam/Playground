import java.util.Scanner;
class Main{
	public static void main (String[] args){
	      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0,dup=n;
      while(n>0)
      {
        sum+=fact(n%10);
        n/=10;
      }
      if(sum==dup)
          System.out.println("Yes");
      else
          System.out.println("No");
	}
  static int fact(int n)
  {
    int i,f=1;
    for(i=2;i<=n;i++)
      f*=i;
    return f;
  }
}