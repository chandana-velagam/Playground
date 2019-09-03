import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j,k;
    int arr[]=new int[n];
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int sum=0,max=0;
    for(i=0;i<n-1;i++)
    {
     if(arr[i+1]<arr[i])
       break;
    }
    for(j=0;j<=i;j++)
      max+=arr[j];
    for(j=i+1;j<n;j++)
      sum+=arr[j];
    if(sum>max)
      max=sum;
    System.out.println(max);
  }
}