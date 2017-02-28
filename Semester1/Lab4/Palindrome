public class Palindrome
{
    public static void main(String args [])
    {
        String a = new String("navan");
        StringBuffer b = new StringBuffer();
        a = a.toUpperCase();
        int count = 0;
        for (int c = a.length(); c > 0; c--)
        {
            b.append(a.charAt(c-1));
        }
        for (int d = a.length(); d > 0; d--)
        {
            if (a.charAt(d-1) == b.charAt(d-1))
            {
                count++;
            }
        }
        if(count == a.length())
        {
            System.out.println(a + " is a palindrome");
        }
        else
        {
            System.out.println(a + " is NOT a palindrome");
        }
    }
}
