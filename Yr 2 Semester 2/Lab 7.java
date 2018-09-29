import java.util.*;
public class Cryptography {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long p = sc.nextLong();
		long g = sc.nextLong();
		long gt = g;
		long gxmodp = sc.nextLong();
		long c1 = sc.nextLong();
		long c2 = sc.nextLong();
		long secret = 0;
		for (int x = 2; x < (int)p; x++) {
			gt = (gt*g)%p;
			if (gt == gxmodp) {
				secret = x;
				break;
			}
		}
		long power = modPow(c1, (p-1-secret), p);
		long message = modMult(power, c2, p);
		System.out.println(message);
		sc.close();
	}
	public static long modPow(long number, long power, long modulus) {
		//raises a number to a power with the given modulus
		//when raising a number to a power, the number quickly becomes too large to handle
		//you need to multiply numbers in such a way that the result is consistently moduloed to keep it in the range
		//however you want the algorithm to work quickly - having a multiplication loop would result in an O(n) algorithm!
		//the trick is to use recursion - keep breaking the problem down into smaller pieces and use the modMult method to join them back together
		if(power==0) return 1;
		else if (power%2==0) {
			long halfpower=modPow(number, power/2, modulus);
			return modMult(halfpower,halfpower,modulus);
		} else {
			long halfpower=modPow(number, power/2, modulus);
			long firstbit = modMult(halfpower,halfpower,modulus);
			return modMult(firstbit,number,modulus);
		}
	}
	public static long modMult(long first, long second, long modulus){
		//multiplies the first number by the second number with the given modulus
		//a long can have a maximum of 19 digits. Therefore, if you're multiplying two ten digits numbers the usual way, things will go wrong
		//you need to multiply numbers in such a way that the result is consistently moduloed to keep it in the range
		//however you want the algorithm to work quickly - having an addition loop would result in an O(n) algorithm!
		//the trick is to use recursion - keep breaking down the multiplication into smaller pieces and mod each of the pieces individually
		if(second==0)
		return 0;
		else if (second%2==0) {
			long half=modMult(first, second/2, modulus);
			return (half+half)%modulus;
		} else {
			long half=modMult(first, second/2, modulus);
			return (half+half+first)%modulus;
		}
	}
}
