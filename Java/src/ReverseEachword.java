
public class ReverseEachword {
	static void wordReverse(String s1) {
		String[] words = s1.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(s1);
		System.out.println(reverseString);
		System.out.println("_________________");
	}

	public static void main(String[] args) {
		wordReverse("Sangeetha is a good girl");
		wordReverse("Durgaprasad is a bad boy");
	}

}
