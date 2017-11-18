import java.util.Scanner;
public class cleanString{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(removeDuplicates(a));
    }
    public static String removeDuplicates(String a){
        if(a.length() <= 1) return a;
        if(a.charAt(0) == a.charAt(1)) return removeDuplicates(a.substring(1));
        else return a.charAt(0) + removeDuplicates(a.substring(1));
    }
}
