import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=1,c=1;
      int dup=n;
      while(dup>0)
      {
        dup/=10;
        c*=10;
      }
      c/=100;
      c=n/c;
     c%=10;
      System.out.println(c);
    }
}