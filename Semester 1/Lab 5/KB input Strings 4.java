import java.util.Scanner;
public class input4
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner( System.in );
        String user_input = scan.nextLine();
        int count = 0;
        for (int i =0; i < user_input.length(); i++)
        {
            if (user_input.charAt(i) == Character.toLowerCase(user_input.charAt(i)))
            {
                count++;
            }
        }
        if (count == user_input.length())
        {
            char c;
            StringBuffer d = new StringBuffer();
            c = Character.toUpperCase(user_input.charAt(0));
            d.append(c);
            d.append(user_input.charAt(1));
            for (int a = 1; a < user_input.length(); a++)
            {
                if (user_input.charAt(a) == ' ')
                {
                    c = Character.toUpperCase(user_input.charAt(a+1));
                    d.append(" " + c);
                    a++;
                }
                if (a != user_input.length()-1)
                {
                    d.append(user_input.charAt(a+1));
                }
            }
            System.out.println(d);
        }
        else
        {
            user_input = user_input.toUpperCase();
            System.out.println("Invalid string");
        }
    }
}
