package jdbc_dao;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		StudentDAO sdao = new StudentDAO();
		
		s1.setId(6);
		s1.setName("Shekhar");
		s1.setMobileNo(123565478);
		s1.setAge(45);
		s1.setDOB("2007-06-12");

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
	}

}
