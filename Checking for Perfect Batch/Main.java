import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,x[],prevsum=0,currsum;
      x=new int[n];
      for(i=0;i<n;i++)
        x[i]=sc.nextInt();
     currsum=x[0];
    for(i=1;i<n;i++)
    {
      currsum+=x[i];
      if(i==2)
      { prevsum=currsum;currsum=0;}
      if((i+1)%3==0 && i>2)
      {  
        if(prevsum!=currsum )
          break;
       prevsum=currsum;
        currsum=0;
      }
    }
      if(i<n)
        System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
  }
}