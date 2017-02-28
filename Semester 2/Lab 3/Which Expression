import java.util.Scanner;
public class regEx{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        matches(a);
    }
    public static void matches(String a){
        if(a.matches("a(a|b)b") == true) System.out.println("1");
        if(a.matches("(ab)*b") == true) System.out.println("2");
        if(a.matches("a(b|a)*") == true) System.out.println("3");
        if(a.matches("(a|b)*a") == true) System.out.println("4");
        if(a.matches("(a|b)*") == false) System.out.println("Not in the language");
    }
}
