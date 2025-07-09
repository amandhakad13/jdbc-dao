package jdbc_dao;

import java.sql.SQLException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentDAO sdao = new StudentDAO();
		
		System.out.print("Enter delete id : ");
		int id = sc.nextInt();
		
		int isDelete = 0;
		
		try {
			isDelete = sdao.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(isDelete > 0) 
			System.out.println("Record Deleted Successfully");
		else
			System.out.print("Record Not Found");
		
		sc.close();	
	}

}
