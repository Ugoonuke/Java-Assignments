import java.util.Scanner;
public class countDigits{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Res: " + countRecursive(a));
    }
    public static int countRecursive(int a){
        if(a == 0) return 0;
        else{
            if(a%100 == 88) return 2 + countRecursive(a/10);
            else if (a%10 == 8) return 1 + countRecursive(a/10);
            else return countRecursive(a/10);
        }
    }
}
