import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int siz = sc.nextInt();
        String[] list = new String[size];
        for(int i = 0; i < size; i++) {
            list[i] = sc.next();
            list = sort(list, i);
        }
        System.out.println(list[siz-1]);
    }
    
    public static String[] sort(String[] raw, int index) {
        while(index > 0 && raw[index].length() == raw[index-1].length()) {
            String temp = raw[index];
            raw[index] = raw[index-1];
            raw[index-1] = temp;
            index--;
            return raw;
        }
        while(index > 0 && raw[index].length() < raw[index-1].length()) {
            String temp = raw[index];
            raw[index] = raw[index-1];
            raw[index-1] = temp;
            index--;
        }
        return raw;
    }
}
