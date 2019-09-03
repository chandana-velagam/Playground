import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=2;i<=n;i++)
           if(prime(i)==1)
             System.out.println(i);
	}
  static int prime(int x)
  {
    int i,a=x/2;
    for(i=2;i<=a;i++)
      if(x%i==0)
        break;
    if(i<=a)
      return 0;
    return 1;
  }
}