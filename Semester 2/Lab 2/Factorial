import java.util.Scanner;
public class Factorial{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.print("Not a valid entry!");
        }
        else{
            int m = sc.nextInt();
            if(m < 0){
                System.out.print("Not a valid entry!");
            }
            else{
                for(; n <= m; n++){
                    getFactorial(n);
                }
            }
        }
    }
    public static void getFactorial(int n){
        int b = 1;
        for(int i = 1; i <= n; i++){
            b *= i;
        }
        System.out.println(b);
        b = 1;
    }
}
