import java.util.Scanner;
public class SumProduct
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int a[] = new int[b];
        int c = 0, d = 1, e = 0;
        for (int i = 0; i < b; i++)
        {
            a[i] = scan.nextInt();
            c += a[i];
            d *= a[i];
        }
        for (int j = 0; j < b; j++)
        {
            if (e < a[j]) e = a[j];
        }
        System.out.println("Sum: " + c);
        System.out.println("Product: " + d);
        System.out.println("Largest Number: " + e);
    }
}
