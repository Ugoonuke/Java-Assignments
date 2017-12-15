import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = 0;
        int temp;
        
        for(int i = 0; i < 32; i++) {
            temp = n<<i;
            if(temp > L) L = temp;
        }
        for(int i = 0; i < 32; i++) {
            temp = n>>i;
            if(temp > L) L = temp;
        }
        for(int i = 0; i < 32; i++) {
            temp = n>>>i;
            if(temp > L) L = temp;
        }
        System.out.println(L);
    }
}
