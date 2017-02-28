import java.util.Scanner;
public class Prime{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        for(; n <= a; n++){
            boolean c = isItPrime(n);
            if(c) System.out.println(n);
        }
    }
    public static boolean isItPrime(int n){
        int b = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n%i == 0) b++;
            if(b > 1){
                return false;
            }
        }
        if(b == 1)  return true;
        else{
            return true;
        }
    }
}
