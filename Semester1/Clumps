import java.util.Scanner;
public class Clumps
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int a[] = new int[b];
        int c[] = new int[10];
        int d, e = 0, k = 0;
        for (int i = 0; i < b; i++)
        {
            a[i] = scan.nextInt();
        }
        d = a[0];
        for (int j = 1; j < b; j++)
        {
            if (d == a[j])
            {
                c[k]++;
            }
            else
            {
                k++;
            }
            d = a[j];
        }
        for (int l = 0; l < 10; l++)
        {
            if (e < c[l]) e = c[l];
        }
        e += 1;
        System.out.println("Biggest Clump Size: " + e);
    }
}
