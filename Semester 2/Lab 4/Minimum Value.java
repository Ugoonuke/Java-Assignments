import java.util.Scanner;

public class q1Recursion
{
    public static void main(String[] args)
    {
        int [] a = fillArray();
        System.out.println(q1Iterative(a));
        System.out.println(q1Recursive(a, 0));
    }
    
    public static int q1Iterative(int[] a)
    {
        int b = a[0];
        for(int i = 0; i < a.length; i++){
            if(b > a[i]) b = a[i];
        }
        return b;
    }
    
    public static int q1Recursive(int[] a, int start){
        if(start == a.length-1){
            return a[start];
        }
        else return (Math.min(a[start], q1Recursive(a, start+1)));
    }
    
    
    public static int [] fillArray()
    {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int [] b = new int[d];
        for(int i = 0; i < d; i++){
            b[i] = sc.nextInt();
        }
        sc.close();
        return b;
    }
}
