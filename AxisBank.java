package Assignment3;

public class AxisBank extends BankInfo{
	
	public int	deposit() {
		System.out.println("deposit = 8000");
		return 0;
}
	public static void main(String[] args) {
		
		BankInfo bankinfo = new BankInfo();
		bankinfo.deposit();
		BankInfo Axis = new AxisBank(); 
		Axis.deposit();
		
		}

}
