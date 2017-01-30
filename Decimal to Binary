import java.util.Scanner;
public class decToBin
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        StringBuffer a = new StringBuffer("");
        StringBuffer b = new StringBuffer("");
        int num = scan.nextInt();
        while (num > 0)
        {
            if ((num%2) == 0) a = a.append(0);
            if ((num%2) == 1) a = a.append(1);
            num /= 2;
        }
        for (int i = (a.length()) - 1; i >= 0; i--)
        {
            b = b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
