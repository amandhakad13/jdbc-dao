package jdbc_dao;

import java.sql.SQLException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		StudentDAO sdao = new StudentDAO();
		
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		System.out.print("Enter name : ");
		String name = sc.next();
		System.out.print("Enter mobile no : ");
		int mobileNo = sc.nextInt();
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		System.out.print("Enter dob : ");
		String dob = sc.next();
		
		s1.setId(id);
		s1.setName(name);
		s1.setMobileNo(mobileNo);
		s1.setAge(age);
		s1.setDOB(dob);

		int isInserted = 0;
		
		try {
			isInserted = sdao.insert(s1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(isInserted > 0) {
			System.out.println("Record Inserted Successfully");
		}
		else {
			System.out.println("Record Not Inserted");
		}
		
		sc.close();
	}

}
