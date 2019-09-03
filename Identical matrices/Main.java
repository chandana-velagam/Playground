import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int r,c,i,j,k;
    r=sc.nextInt();
    c=sc.nextInt();
    int a1[][]=new int[r][c];
   int a2[][]=new int[r][c];
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        a1[i][j]=sc.nextInt(); 
    int ch=0;
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
      {
        a2[i][j]=sc.nextInt();
        if(a1[i][j]!=a2[i][j])
          ch=1;
      }
    if(ch==0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
    