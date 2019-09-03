import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
       if(i%2==0)
       {
         if(j<n-1)
           System.out.print(i+1);
         else
           System.out.print(i+2);
       }
        else
        {
            if(j>0)
           System.out.print(i+1);
         else
           System.out.print(i+2);
       
        }
        
          System.out.println();
      }
	}
}