package org.student;

import org.department.Department;

public class Student extends Department{

	public String studentName() {
		System.out.println("StudentName = Sushmitha");
		return null;
	}
	public String studentDept() {
		System.out.println("SDept=EEE");
		return null;
		
	}
	
	public int studentId() {
		System.out.println("ID= 125478");
		return 0;
		
	}
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studentDept();
		stud.studentId();
		stud.studentName();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
	
	}
}
