import java.util.Scanner;
public class arraySwap
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner (System.in);
        int a [] = new int[5];
        int b, c;
        for (int i = 0; i < 5; i++)
        {
            a[i] = scan.nextInt();
        }
        for (int j = 0; j < 5; j++)
        {
            System.out.print(a[j]);
        }
        b = a[0];
        c = a[4];
        a[4] = b;
        a[0] = c;
        System.out.println("");
        for (int k = 0; k < 5; k++)
        {
            System.out.print(a[k]);
        }
    }
}
