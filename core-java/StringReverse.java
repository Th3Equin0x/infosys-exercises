
public class StringReverse {

	public static void main(String[] args) {
		System.out.println(strReverse("infosys"));

	}

	public static String strReverse(String input) {
		String output = "";
		
		StringBuilder reverse = new StringBuilder();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse.append(input.charAt(i));
		}
		
		output = reverse.toString();
		return output;
	}
	
}
