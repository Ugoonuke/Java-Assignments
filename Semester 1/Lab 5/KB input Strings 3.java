import java.util.Scanner;
public class input3
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner( System.in );
        String a = scan.nextLine();
        String b = scan.nextLine();
        if (a.equals(b) == true)
        {
            System.out.println("Exactly the same: True");
        }
        else
        {
            System.out.println("Exactly the same: False");
            a = a.toLowerCase();
            b = b.toLowerCase();
            if (a.equals(b) == true)
            {
                System.out.println("Similar: True");
            }
            else
            {
                System.out.println("Similar: False");
            }
        }
    }
}
