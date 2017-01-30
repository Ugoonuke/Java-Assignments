import java.util.Scanner;
public class binToDec
{
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        int binary = scan.nextInt();
        int power=0, num=0;
        while (binary > 0)
        {
            num = num + ((binary%2)*(int)(Math.pow(2, power)));
            power++;
            binary /= 10;
        }
        System.out.println(num);
    }
}
