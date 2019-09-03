import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int dup=n,nod=0,sum=0,a;
      while(dup!=0)
      {
        dup/=10;
        nod++;
      }
      dup=n;
      while(dup!=0)
      {
        a=dup%10;
        dup/=10;
        sum+=Math.pow(a,nod);
      }
     if(n==sum)
          System.out.println("Armstrong Number");
	else
      System.out.println("Not a Armstrong Number");
    }
}