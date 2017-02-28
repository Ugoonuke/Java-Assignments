import java.util.Scanner;
public class MethodsArrays{
    public static void main(String args[]){
        int[] a = fillArray();
        System.out.println("Sum = " + sumArray(a));
        System.out.println("Average = " + avgArray(a));
        printArray(a);
    }
    public static int[] fillArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static int sumArray(int[] a){
        int b = 0;
        for(int i = 0; i < a.length; i++){
            b += a[i];
        }
        return b;
    }
    public static int avgArray(int[] a){
        int b = 0;
        for(int i = 0; i < a.length; i++){
            b += a[i];
        }
        b = b/a.length;
        return b;
    }
    public static void printArray(int[] a){
        for(int i = 0; i <a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
