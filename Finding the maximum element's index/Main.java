import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,x[],max=-9999,ind=0;
      x=new int[n];
      for(i=0;i<n;i++)
      {
        x[i]=sc.nextInt();
        if(max<x[i])
        {
          max=x[i];
          ind=i;
        }
      }
    System.out.println(ind);
   
  }
}