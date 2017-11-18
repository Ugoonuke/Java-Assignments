public class While
{
    public static void main(String args [])
    {
        int num1 = 40;
        int count = 0;
        double div = num1;
        while (div >= 2)
        {
            div = div / 2;
            count++;
        }
        System.out.println(count);
    }
}
