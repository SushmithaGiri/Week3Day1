package Assignment7;

public class FindIndexChar {
	
	public static void main(String[] args) {
		
		String text = "Java Exercise";
		int text_char = text.indexOf("E");
		System.out.println("Index of E is: "+text_char);
		char text_char1 = text.charAt(11);
		System.out.println("Character at index 11 is: "+text_char1);
	}

}
