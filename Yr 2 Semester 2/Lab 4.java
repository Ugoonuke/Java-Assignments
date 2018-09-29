import java.util.*;

public class QuickSort {
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);
        int num = myscanner.nextInt();
        String[] myarray = new String[num];
        for(int i=0;i<num;i++){
            myarray[i] = myscanner.next();
        }
        quicksort(myarray); // you need to write this method
        for(int i=0;i<num;i++){
            System.out.println(myarray[i]);
        }
        myscanner.close();
    }
    
    public static void quicksort(String[] array) {
		quicksort(array, 0, array.length-1);
	}
	
	public static void quicksort(String[] array, int left, int right) {
		if(left >= right) return;
		int  pivot = right;
		int r = right-1;
		int l = left;
		
		while(l < pivot && r >= 0) {
			if(l ==r) {
				if(partition(array[l], array[pivot])) {
				    swap(array, l, pivot);
				    break;
                }
			}
		  if(l > r) {
			swap(array, l, pivot);
            break;
		}
		if((partition(array[l], array[pivot])) && !(partition(array[r], array[pivot]))) {
			swap(array, l, r);
			l++;
			r--;
		}
		else if(partition(array[l], array[pivot])) r--;
		else if(!partition(array[r], array[pivot])) l++;
		else {
			l++;
			r--;
		}
        }
		quicksort(array, left, r);
		quicksort(array, l+1, right);
	}
	
	public static boolean partition(String left, String right) {
			char[] s1 = left.toCharArray();
			char[] s2 = right.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			if(s1[s1.length-1] > s2[s2.length-1]) return true;
			else if(s1[s1.length-1] < s2[s2.length-1]) return false;
			else {
				if(left.compareTo(right) > 0) return true;
				else return false;
			}
	}
	
	public static void swap(String[] array, int left, int right) {
		String temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
