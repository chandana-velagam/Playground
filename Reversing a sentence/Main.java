import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        reverse(sb, 0, str_len - 1);
        int start = 0;
        for(int idx = 0; idx < str_len; idx++)
        {
            if(sb.charAt(idx) == ' ')
            {
                
                reverse(sb, start, idx - 1);
                start = idx + 1;
            }
            else if(idx == (str_len - 1))
            {
                reverse(sb, start, idx);
                start= idx + 1;
            }
        }
        System.out.print(sb);
    }
    public static void reverse(StringBuilder sb, int start_idx, int end_idx)
    {
        int end = end_idx;
        int front = start_idx;
        while(front < end)
        {
            char tmp_ch = sb.charAt(front);
            sb.setCharAt(front, sb.charAt(end));
            sb.setCharAt(end, tmp_ch);
            front++;
            end--;
        }
    }
}