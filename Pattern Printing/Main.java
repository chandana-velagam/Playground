import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       int r,c,i,j;
      r=sc.nextInt();
      c=sc.nextInt();
      for(i=r;i>0;i--)
      {
        for(j=c;j>=i;j--)
          System.out.print(j);
       	for(j=0;j<i-1;j++)
         System.out.print(i);
        System.out.println();
      }
          
    }
}