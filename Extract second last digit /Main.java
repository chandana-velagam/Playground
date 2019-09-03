import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      n/=10;
      n%=10;
      System.out.println(n);
	}
}