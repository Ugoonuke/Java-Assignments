import java.util.*;
public class CS210L4	{
	public static void main(String args[] ) throws Exception	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer and the program will determine the difference between the 2 closest prime numbers: ");
	    	int num = sc.nextInt();
	    	int prime1 = 0;
	    	int prime2 = 0;
	    	for(int a = num+1;; a++)	{
	    	if(primeCheck(a))	{
	    		prime1 = a;
	             break;
	        }
	    }
	    for(;; num--) {
	        if(primeCheck(num))	{
	            prime2 = num;
	            break;
	        }
	    }
	    System.out.println("The difference between " + prime1 + " and " + prime2 + " is " +(prime1 -prime2));
	    sc.close();
	}
	public static boolean primeCheck(int a)	{
	    for(int i = 2; i <= Math.sqrt(a); i++)	{
	       if(a%i == 0)	return false;
	    }
	    return true;
	}
}
