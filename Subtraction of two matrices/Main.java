import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc=new Scanner(System.in);
    int r,c,i,j;
    r=sc.nextInt();
    c=sc.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        a[i][j]=sc.nextInt();
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        b[i][j]=sc.nextInt();
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        System.out.print(a[i][j]-b[i][j]+" ");
      System.out.println();
    }
  }
}