import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Vertcoin_Wallet {
	public static void main(String args[]) throws NoSuchAlgorithmException {
		String hex = new String("");
		for(int i = 0; i < 64; i++) {
			hex += rand();
		}
		String string80 = new String("80");
		string80 += hex;
		System.out.println(string80);
		String next = sha256(string80);
		next = sha256(next);
		string80 += next.substring(0, 8);
		BigInteger num = new BigInteger(string80,16);
		String enjoy = base58(num);
		System.out.print(enjoy);
	}
	
	public static String rand() { // Produces a random hexadecimal character
		String base16 = new String("0123456789ABCDEF");
		Random r = new Random();
		String temp = new String("");
		int n = r.nextInt(16);
		int m = r.nextInt(16);
		if(n < m) temp = base16.substring(n,m);
		else if(n > m) temp = base16.substring(m,n);
		else return base16.substring(n,n+1);
		int key = r.nextInt(temp.length());
		return temp.substring(key,key+1);
		}

		static String sha256(String input) throws NoSuchAlgorithmException {
		byte[] in = hexStringToByteArray(input);
		MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
		byte[] result = mDigest.digest(in);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length; i++) {
			sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}

	 public static byte[] hexStringToByteArray(String s) {
		 int len = s.length();
		 byte[] data = new byte[len / 2];
		 for (int i = 0; i < len; i += 2) {
			 data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i+1), 16));
		 	}
		 	return data;
	 }
	 
	 public static String base58(BigInteger n) { // Converts BigInt to base 58
		 String alpha = new String("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz");
		 String finish = new String("");
		 while(n.compareTo(new BigInteger("58")) > 0) {
			 BigInteger mod = n.mod(new BigInteger("58"));
			 finish = alpha.charAt(mod.intValue())+finish;
			 n = n.divide(new BigInteger("58"));
		 }
		 if(n.compareTo(new BigInteger("0")) > 0) {
			 finish = alpha.charAt(n.intValue())+finish;
		 }
		 return finish;
	 }
}
