import java.util.Scanner;
public class MinNumber{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(minFunction(a,b,c));
    }
    public static int minFunction(int a, int b, int c){
        if(a < b && a< c) return a;
        else if(b < a && b < c) return b;
        else return c;
    }
}
