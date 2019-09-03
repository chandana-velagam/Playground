import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0,dup=n;
      while(dup>0)
      {
        sum+=dup%10;
        dup/=10;
      }
      System.out.println(sum);
	}
}