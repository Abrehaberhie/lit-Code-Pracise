package litCodePractise9quetions;

public class ReversWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = reverseWords("I am java developer");
		System.out.println(result);

	}
	
	public static String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length - 1; i >= 0; i--){
            if(str[i] != ""){
                sb.append(str[i]); // add word
                sb.append(" "); // add space after that word
            }
        }
        sb.setLength(sb.length() - 1); //delete last space by reducing size
        return sb.toString();
    }

}
