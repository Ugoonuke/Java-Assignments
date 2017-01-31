import java.util.Scanner;
public class Casting1
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        double a[] = new double[5];
        double b = 0.00;
        double c = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++)
        {
            String d = scan.nextLine();
            String e = d.substring(0, 5);
            a[i] = Double.parseDouble(e);
            if (b < a[i]) b = a[i];
            if (c > a[i]) c = a[i];
        }
        System.out.println("Largest: " + b);
        System.out.println("Lowest: " + c);
    }
}
