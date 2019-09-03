import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int end = len - 1;
        int front = 0;
        boolean palindrome = true;
        while(front++ < end--)
          if(str.charAt(front) != str.charAt(end))
            {
                palindrome = false;
                break;
            }
        if(palindrome == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    } 
}