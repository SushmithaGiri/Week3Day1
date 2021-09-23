package Assignment7;

public class ReplaceCharacter {
	
	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		String NewString = sentence.concat("#");
		System.out.println("NewString : "+NewString);
		String replaced = sentence.replaceAll("king","Queen");
		System.out.println(replaced);
		String SpecificChar =sentence.substring(5, 11);
		System.out.println("Chars from 5 to 11 : "+SpecificChar);
	}

}
