import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n],j,i;
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=0;j<n;j++)
          if(arr[j]==i)
            break;
        if(!(j<n))
        {
          System.out.println(i);
          break;
        }
      }
          
    }
}