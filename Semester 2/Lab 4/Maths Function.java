import java.util.Scanner;

public class q2Recursion
{
    
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(q2Iterative(n));
        System.out.println(q2Recursive(n));
    }
    public static int q2Iterative(int n){
        int b =  2;
        if(n == 1) return b;
        else{
            for(int i = 1; i < n; i++){
                b = (4 * b) - (3 * (i+1));
            }
        }
        return b;
    }
    public static int q2Recursive(int n){
        int b = 2;
        if(n == 1) return b;
        else{
            return (4*q2Recursive(n-1)) - (3*n);
        }
    }
}
