import java.util.Scanner;
public class stringRecursion{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.print(reverseRecursive(a));
    }
    public static String reverseRecursive(String a){
        if(a.length() <= 1){
            return a;
        }
        else{
            return reverseRecursive(a.substring(1,a.length()))+ a.charAt(0);
        }
        
    }
}
