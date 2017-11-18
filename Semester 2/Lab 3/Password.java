import java.util.Scanner;
public class regEx{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = test(a);
        if(b >=0 && b < 4) System.out.print("Password strength: Weak");
        if(b >= 4 && b < 6) System.out.print("Password strength: Fair");
        if(b >=6 && b < 8) System.out.print("Password strength: Good");
        if(b >= 8 && b <= 10) System.out.print("Password strength: Strong");
    }
    public static int test(String a){
        int b = 0;
        if(a.matches(".{8,}") == true) b++;
        if(a.matches(".{12,}") == true) b++;
        if(a.matches(".*[a-z].*[a-z].*") == true) b++;
        if(a.matches(".*[a-z].*") == true) b++;
        if(a.matches(".*[A-Z].*[A-Z].*") == true) b++;
        if(a.matches(".*[A-Z].*") == true) b++;
        if(a.matches(".*[0-9].*") == true) b++;
        if(a.matches(".*[0-9].*[0-9].*") == true)b++;
        if(a.matches(".*(!|\\?|@|#).*") == true)b++;
        if(a.matches(".*(!|\\?|@|#).*(!|\\?|@|#).*") == true)b++;
        return b;
    }
}
