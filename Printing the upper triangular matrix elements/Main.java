import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int i, j,k;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(i = 0; i < r; i++)
             for(j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
       for(k = 0; k < c; k++)
  	        for(i = 0, j = k; j < c ; i++, j++)
    	    System.out.print(matrix[i][j]+" ");
    }
}