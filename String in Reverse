public class Strings3
{
    public static void main(String args [])
    {
        String a = new String("There are no strings attached");
        String b = new String(" ");
        int e = a.length();
        for (int c = a.length(); c > 0; c--)
        {
            if (a.charAt(c - 1) == b.charAt(0))
            {
                String d = a.substring(c, e);
                a = a.replace(d + " ", "");
                System.out.println(new StringBuffer(d).reverse().toString());
                e = c - 1;
            }
        }
       for (int c = 0; c < a.length(); c++)
        {
            if (a.charAt(c) == b.charAt(0))
            {
                String f = a.substring(0, c);
                System.out.println(new StringBuffer(f).reverse().toString());
            }
        }
    }
}
