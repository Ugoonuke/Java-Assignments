public class Song
{
    public static void main(String args [])
    {
        int count = 10;
        while (count > 1)
        {
            System.out.println(count + " in a bed and the little one said,\n'Roll over, roll over'\nThey all rolled over and one fell out,");
            count--;
        }
        if (count == 1)
        {
            System.out.println(count + " in a bed and the little one said,\n'Alone at last'");
        }
    }
}
