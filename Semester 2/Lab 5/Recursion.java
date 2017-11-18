import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int n = sc.nextInt();
        System.out.println(checkForSub(a, b, n));
    }
    public static boolean checkForSub(String a, String b, int n) {
        if( n == 0) return true;
        if(a.length() < b.length()) return false;
        else {
            if((a.substring(0, b.length()).equals(b))) {
                n -= 1;
                return (checkForSub(a.substring(1), b, n));
            }
            else {
               return (checkForSub(a.substring(1), b, n));
            }
        }
    }
}
