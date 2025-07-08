package jdbc_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
	
		public int insert(Student s) throws SQLException { 
			
			Connection con = DBConnection.getConnection();
			
			PreparedStatement pstmt = con.prepareStatement("insert into student_info values (?,?,?,?,?)");
			pstmt.setInt(1, s.getId());
			pstmt.setString(2, s.getName());
			pstmt.setInt(3, s.getMobileNo());
			pstmt.setInt(4, s.getAge());
			pstmt.setString(5, s.getDOB());
			
			int isInsert = pstmt.executeUpdate();
			
			return isInsert;
		}
		
}
