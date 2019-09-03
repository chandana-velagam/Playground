import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    int len2 = str2.length();
    int len1 = str1.length();
    int cnt = 0;
    for (int i = 0; i <=(len1 - len2); i++)
    {
      boolean is_matching = true;
      for(int j = 0; j < len2; j++)
        if(str1.charAt(i + j) != str2.charAt(j))
          is_matching = false;
      if(is_matching == true)
       cnt++;
    }
    System.out.println(cnt);
  } 
}