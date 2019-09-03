import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,j;
    int arr[]=new int[n];
    for(i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int rep=arr[0],max=-9999,count;
    for(i=0;i<n;i++)
    {
      count=0;
      for(j=0;j<n;j++)
      if(arr[i]==arr[j])
        count++;
      if(count>max)
      {
        max=count;
        rep=arr[i];
      }
    }
    System.out.println(rep);
  }
}