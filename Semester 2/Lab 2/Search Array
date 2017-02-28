import java.util.Scanner;
public class SearchArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = (int)sc.nextDouble();
        double[] a = new double[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextDouble();
        }
        double m = sc.nextDouble();
        boolean b = findElement(a, m);
        if(b) System.out.print(m + " was found in the array");
        else System.out.print(m + " was NOT found in the array");
    }
    public static boolean findElement(double a[], double m){
        for(int i= 0; i < a.length; i++){
            if(a[i] == m) return true;
        }
        return false;
    }
}
