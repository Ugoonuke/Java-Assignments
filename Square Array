import java.util.Scanner;
public class LargestRow
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int a[][] = new int[b][b];
        int d[] = new int[b];
        int e = 0;
        int f = 1;
        for (int i = 0; i < b; i++)
        {
            for (int j = 0; j < b; j++)
            {
                a[i][j] = scan.nextInt();
                d[i] += a[i][j];
            }
            if (e < d[i])
            {
                e = d[i];
                f = i + 1;
            }
        }
        System.out.println("R" + f);
    }
}
