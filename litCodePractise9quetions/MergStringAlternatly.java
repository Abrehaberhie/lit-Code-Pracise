package litCodePractise9quetions;

public class MergStringAlternatly {

	public static void main(String[] args) {
		String result =mergeAlternately("abc", "dsr");
		// TODO Auto-generated method stub
		System.out.println(result);

	}
	public static String mergeAlternately(String word1, String word2) {
	    StringBuilder sb = new StringBuilder();
	    int size = Math.min(word1.length(), word2.length());
	    for (int i = 0; i < size; i++) {
	        sb.append(word1.charAt(i)).append(word2.charAt(i));
	    }
	    if (word1.length() > word2.length()) {
	        sb.append(word1.substring(word2.length()));
	    } else {
	        sb.append(word2.substring(word1.length()));
	    }
	    return sb.toString();
	}

}
