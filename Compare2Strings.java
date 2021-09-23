package Assignment7;

public class Compare2Strings {
	
	
	
	public static void main(String[] args) {
		String str1="I am Learning Java";
		String str2="i am Learning Java";
		
		if(str1==str2) {
			System.out.println("they are same");
		}
		if((str1).equals(str2)) {
			System.out.println("They are equal");
		}
		
		if((str1).equalsIgnoreCase(str2)) {
			System.out.println("Both Strings are same");
		}
	}

}
