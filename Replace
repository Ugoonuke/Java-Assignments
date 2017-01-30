import java.util.Scanner;
public class input1
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner( System.in );
        String a = scan.nextLine();
        int count = 0;
        for (int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) == 'a')
            {
                count++;
            }
        }
        if (count <= 3)
        {
            a = a.replaceAll("a", "#");
        }
        if (count > 3)
        {
            a = a.replaceAll("a", "@");
        }
        System.out.println(a);
    }
}
