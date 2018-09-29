import java.util.*;
public class ASCII_tree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(ASCII(s1));
		freq(s1);
		sc.close();
	}
	public static String ASCII(String s1) {
		String s2 = new String("");
		for(int i = 0; i < s1.length(); i++) {
			String temp = Integer.toBinaryString((int)s1.charAt(i));
			while(temp.length() < 7) temp = "0" + temp;
			s2 += temp+" ";
		}
		return s2;
	}
	public static void freq(String s1) {
		int[] ASC = new int[256];
		int c = 0;
		String asc;
		String a = s1;
		for(int i = 0; i < a.length(); i++) {
			c = a.charAt(i);
			ASC[c]++;
		}
		for(int i = 0; i < ASC.length; i++) {
			if(ASC[i] != 0) {
				asc = Character.toString((char)i);
				System.out.println("'"+asc+"'"+" appeared "+ASC[i]+" time(s)");
			}
		}
	}
}
