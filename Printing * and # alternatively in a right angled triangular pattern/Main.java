import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        int num=0,i,j;
      for(i=0;i<n;i++)
      {
        for(j=0;j<=i;j++)
          if(num++%2==0)
            System.out.print("*");
        else
          System.out.print("#");
      
      System.out.println();
    }
	}
}