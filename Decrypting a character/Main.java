import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int k=sc.nextInt();
      if('a'-(char)(ch-k) >1)
      System.out.print((char)(ch-k));
      else
        System.out.print((char)('z'-('a'-(char)(ch-k)-1)));
    }
}