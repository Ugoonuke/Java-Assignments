import java.util.Scanner;
public class EvenArrays
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[10];
        int b = scan.nextInt() + 1;
        int c = 0;
        while (c < 10)
        {
            if (b%2 == 0)
            {
                a[c] = b;
                b++;
                c++;
            }
            else b++;
        }
        int q = scan.nextInt();
        while (q !=-1)
        {
            if (q > 9 || q < -1) System.out.println("Position " + q + ": No such index!");
            else System.out.println("Position " + q + ": " + a[q]);
            q = scan.nextInt();
        }
    }
}
