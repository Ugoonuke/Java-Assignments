import java.util.Scanner;
public class SearchArray{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] a = new String[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.next();
                a[i][j] = a[i][j].toLowerCase();
            }
        }
        String b = sc.next();
        String d = b.toLowerCase();
        int c = countStrings(a, d);
        if(c == 0) System.out.print(b + " was NOT found in the array");
        else System.out.print(b + " is contained " + c + " times in the array");
    }
    public static int countStrings(String a[][], String d){
        int c = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i][j].equals(d) == true) c++;
            }
        }
        return c;
    }
}
