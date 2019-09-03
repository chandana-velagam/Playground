import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n],i;
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(i=0;i<n/2;i++)
      {
        if(arr[i]!=arr[n-i-1])
          break;
      }
      if((i<n/2))
        System.out.println("No");
      else
        System.out.println("Yes");
    }
}