package org.system;

public class Desktop extends computer{

	public int desktopSize() {
		
		int size = 32;
		System.out.println(size);
		return size;
		
	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopSize();
		desk.computermodel();
	
}


}
