import java.util.Scanner;
public class sumDigits{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Res: " + recursiveSum(a));
    }
    public static int recursiveSum(int a){
        if(a == 0) return 0;
        else{
            return (a%10) + recursiveSum(a/10);
        }
    }
}
