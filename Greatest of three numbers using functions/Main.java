import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        n1=great(n1,n2);
        if(n1>n3)
          System.out.println(n1);
      else
        System.out.println(n3);
	}
  static int great(int x,int y)
  {
    if(x>y)
      return x;
    return y;
  }
}