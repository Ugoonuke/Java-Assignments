import java.util.Scanner;
public class SumOfOdd
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int c = scan.nextInt();
        int a[][] = new int[b][c];
        int d = 0;
        int e = 0;
        for (int i = 0; i < b; i++)
        {
            for (int j = 0; j < c; j++)
            {
                a[i][j] = scan.nextInt();
                if (a[i][j] % 2 != 0)
                {
                    d++;
                    e += a[i][j];
                }
            }
        }
        System.out.println("Odd number count = " + d);
        System.out.println("Sum of odd numbers = " + e);
    }
}
