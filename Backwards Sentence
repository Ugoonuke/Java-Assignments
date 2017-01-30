public class Backwards
{
    public static void main(String args [])
    {
        String sentence = new String("If a machine is expected to be infallible, it cannot also be intelligent");
        char c;
        StringBuffer d = new StringBuffer();
        c = Character.toUpperCase(sentence.charAt(0));
        d.append(c);
        d.append(sentence.charAt(1));
        for (int a = 1; a < sentence.length(); a++)
        {
            if (sentence.charAt(a) == ' ')
            {
                c = Character.toUpperCase(sentence.charAt(a+1));
                d.append(" " + c);
                a++;
            }
            if (a != sentence.length()-1)
            {
                d.append(sentence.charAt(a+1));
            }
        }
        String g = new String(d);
        int e = g.length();
        for (int a = g.length() - 1; a >= 0; a--)
        {
            if (g.charAt(a) == ' ')
            {
                String f = g.substring(a+1, e);
                System.out.println(f);
                e = a - 1;
                g = g.substring(0, a);
                a--;
            }
        }
        for (int i = 0; i < g.length(); i++)
        {
            if (g.charAt(i) == ' ')
            {
                String h = g.substring(0, i);
                System.out.println(h);
            }
        }
    }
}
