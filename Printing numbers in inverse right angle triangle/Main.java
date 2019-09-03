import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int row_no = n ; row_no > 0 ; row_no--){
			for(int col_no = row_no; col_no>0 ; col_no--){
				System.out.print(col_no);
			}
			System.out.print("\n");			
		}
	}
}	