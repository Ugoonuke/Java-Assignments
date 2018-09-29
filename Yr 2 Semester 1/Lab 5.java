import java.util.*;

public class Solution {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        int r;
        int n = sc.nextInt();
        int t = sc.nextInt();
        int count = 0;
        int tries = 50000;
        double per;
        for(int j =0; j < tries; j++)   {
            int tails = 0;
            for(int i = 0; i < n; i++)  {
                r = (int)(Math.random() *2);
                if(r == 0) tails++;
                if(r == 1) tails = 0;
                if(tails == t)  {
                    count++;
                    break;
                }
            }
        }
        per = ((double)count/(double)tries)*100.0;
        if(t == 0) {
            System.out.println(100);
        }
        else if(n == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(Math.round(per));
        }
    }
}
