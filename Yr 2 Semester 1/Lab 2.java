import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int diff1 = 0;
        int diff2 = 0;
        int diff3 = 0;
        int temp = 0;
        int [] num = new int[a];
        for(int i = 0; i < a; i++) {
            num[i] = sc.nextInt();
            
        }
        for(int i = 0; i < a; i++) {
            for(int j = a-1; j > 0 ; j--)
            {
                if(num[j]<num[j-1]) {
                    temp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = temp;
                }
            }
        }
        diff1 = num[1] - num[0];
        if(diff1 < 0) diff1 *= -1;
        diff2 = num[2] - num[1];
        if(diff2 < 0) diff2 *= -1;
        if(diff1 > diff2) System.out.println(num[0]);
        if(diff1 < diff2) System.out.println(num[2]);
        if(diff1 == diff2) System.out.println("NA");
    }
}
