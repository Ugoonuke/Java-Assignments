import java.util.Scanner;
public class binAddition
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int bin1 = scan.nextInt();
        int bin2 = scan.nextInt();
        StringBuffer a = new StringBuffer("");
        StringBuffer b = new StringBuffer("");
        int power=0, num=0, c=0;
        while (bin1 > 0)
        {
            num += ((bin1%2)*(int)(Math.pow(2,power)));
            power++;
            bin1 /= 10;
        }
        c += num;
        power = 0;
        num = 0;
        while (bin2 > 0)
        {
            num += ((bin2%2)*(int)(Math.pow(2,power)));
            power++;
            bin2 /= 10;
        }
        c += num;
        while (c > 0)
        {
            if((c%2) == 0) a.append(0);
            if((c%2) == 1) a.append(1);
            c /= 2;
        }
        for (int i = (a.length())-1; i >= 0; i--)
        {
            b = b.append(a.charAt(i));
        }
        System.out.println(b);
    }
}
