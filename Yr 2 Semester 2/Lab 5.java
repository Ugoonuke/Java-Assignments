import java.util.*;

class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the letters to use: ");
		String characters = scan.nextLine().replaceAll(" ","");
		System.out.println();

		FileIO reader = new FileIO();
		String [] dictionary = reader.load("dictionary.txt");

		//System.out.println(dictionary[0]);

		List <String> array2 = new ArrayList <>();

		for(String dictWord : dictionary) {
			if(canMake(dictWord, characters))
			{
				array2.add(dictWord);
			}

		}
		Collections.sort(array2, new Comparator <String>() {
			@Override
			public int compare(String a, String b) {
				int first = a.length();
				int second = b.length();
				
				if(first > second)
				{
					return -1;
				}
				if(first > second)
				{
					return 1;
				}
				return a.compareTo(b);
			}
		});

		for(String word : array2) {
			System.out.println(word);
		}
	}

		public static boolean canMake(String word, String availLetters) {
			for(char c : word.toCharArray()) {
				if(availLetters.indexOf("" + c) == -1) {
					return false;
				}

				availLetters = availLetters.replaceFirst("" + c, "");

			}
			return true;
		}
}
