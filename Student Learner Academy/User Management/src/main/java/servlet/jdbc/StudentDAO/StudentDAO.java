package servlet.jdbc.StudentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import servlet.jdbc.ConnectionClass.ConnectionProvider;
import servlet.jdbc.student.StudentEntity;

public class StudentDAO {
	public static boolean InsertStudentIntoDB(StudentEntity student) {
		boolean ans = false;
		try {
			Connection conn = ConnectionProvider.CreateConnection();
			String InsertData = "insert into student_detail (name, contact, email, course, batch) values(?,?,?,?,?);";
			PreparedStatement stmt = conn.prepareStatement(InsertData);

			stmt.setString(1, student.getName());
			stmt.setString(2, student.getContact());
			stmt.setString(3, student.getEmail());
			stmt.setString(4, student.getCourse());
			stmt.setString(5, student.getBatch());
			stmt.executeUpdate();
			return ans = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ans;
	}

	public static boolean DeleteStudentFromDB(int id) {
		boolean ans = false;
		try {
			Connection conn = ConnectionProvider.CreateConnection();
			String DeleteData = "delete from student_detail where id=?";
			PreparedStatement stmt = conn.prepareStatement(DeleteData);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			ans = true;
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return ans;
	}

	public static Boolean ShowData() {
		boolean ans = false;
		try {
			Connection conn = ConnectionProvider.CreateConnection();
			String ShowData = "select * from student_detail";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(ShowData);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String contact = rs.getString(3);
				String email = rs.getString(4);
				String course = rs.getString(5);
				String batch = rs.getString(6);
				System.out.println(id + " " + name + " " + contact + " " + email + " " + course + " " + batch);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean UpdateStudentIntoDB(StudentEntity student) {
		boolean ans = false;
		try {
			Connection conn = ConnectionProvider.CreateConnection();
			String updatedata = "update student_detail set name=?, contact=?, email=?, course=?, batch=? where id=?";
			PreparedStatement stmt = conn.prepareStatement(updatedata);

			stmt.setString(1, student.getName());
			stmt.setString(2, student.getContact());
			stmt.setString(3, student.getEmail());
			stmt.setString(4, student.getCourse());
			stmt.setString(5, student.getBatch());
			stmt.setInt(6, student.getId());

			stmt.executeUpdate();
			return ans = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ans;
	}
}
