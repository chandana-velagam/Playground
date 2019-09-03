import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int r,c,i,j,k;
    r=sc.nextInt();
    c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        arr[i][j]=sc.nextInt();
    for(i=r-1;i>=0;i--)
    {
      for(j=0;j<c;j++)
        System.out.print(arr[j][i]+" ");
    System.out.println();
  }
  }
}