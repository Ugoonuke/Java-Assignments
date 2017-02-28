import java.util.Scanner;
public class AddElements
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        double a[] = new double[10];
        double b;
        for (int i = 0; i < 10; i++)
        {
            a[i] = scan.nextDouble();
        }
        for (int j = 1; j < 10; j++)
        {
            b = (double)Math.round((a[j-1] + a[j])*100)/100;
            System.out.println(a[j] + " + " + a[j-1] + " = " + b);
        }
    }
}
