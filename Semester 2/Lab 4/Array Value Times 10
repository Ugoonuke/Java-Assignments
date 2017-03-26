import java.util.Scanner;

public class timesTen
{
    public static void main(String[] args)
    {
        int[] a = fillArray();
        System.out.println(checkArray(a, 0));
    }
	
	public static boolean checkArray(int[] a, int c){
	    boolean b = false;
	    if(a.length-1 == c) return false;
	    if(a[c] == a[c+1]/10) return true;
	    else return checkArray(a, c+1);
	}
	
	
	public static int [] fillArray()
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int [] filledArray = new int[x];

        for(int i = 0; i<filledArray.length; i++){
            filledArray[i] = scan.nextInt();
        }
        scan.close();
        return filledArray;
    }
}
