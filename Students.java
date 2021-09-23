package Assignment4;

public class Students {

	public String getStudentInfo(int ID) {
		System.out.println("ID :"+ID);
		return null;
	
	}
	public String getStudentInfo(int ID,String name) {
		System.out.println(ID);
		System.out.println("Name: "+name);
		return null;
	
	}
	public String getStudentInfo(String Email,long phoneNo) {
		
		System.out.println("Email ID: "+Email);
		System.out.println("Contact Details: "+phoneNo);
		return null;
	
	}
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(123);
		stud.getStudentInfo(123, "Sush");
		stud.getStudentInfo("sus@gmail.com",159258347L);

	}

}
