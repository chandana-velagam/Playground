import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      sum+=n%10;
      sum+=n/100;
      System.out.println(sum);
	}
}