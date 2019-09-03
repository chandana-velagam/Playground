 
import java.util.Scanner;
class Main
{ 
   public static void main(String[] args)  
    { 
      Scanner sc=new Scanner(System.in);
      int n,i;
      n=sc.nextInt();
      int arr[]=new int[n];
      for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int k=sc.nextInt();
      for(i=0;i<n;i++)
        for(int j=i+1;j<n;j++)
        if(arr[j]<arr[i])
        {
          int t=arr[i];
          arr[i]=arr[j];
          arr[j]=t;
        }
     System.out.println(arr[n-k]);
    } 
} 