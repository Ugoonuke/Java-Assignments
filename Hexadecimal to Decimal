import java.util.Scanner;
public class hexToDec
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        String hex = scan.nextLine();
        String d = new String("0123456789ABCDEF");
        int b, c=0, e=0;
        for (int i = (hex.length())-1; i >= 0; i--)
        {
            b = d.indexOf(hex.charAt(i));
            c += (b * (int)(Math.pow(16,e)));
            e++;
        }
        System.out.println(c);
    }
}
