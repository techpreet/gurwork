package com.gur.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gur.beans.Students;
import com.gur.connection.GetConnection;

/**
 *
 * @author Gurpreet
 *
 */
@Component
public class StudentDAO {

	// you might have connect with DB to get the questions
	PreparedStatement ps = null;

	public boolean saveQuestion(Students student) {
		System.out.println("ID " + student.getStudentId());
		System.out.println("Name " + student.getStudentName());
		System.out.println("DOB" + student.getStudentDob());

		return student.getStudentName().length() > 3;

	}
/**
 *
 * @author Gurpreet
 * @return all students with jdbc
 *
 */

	public List<Students> getAllStudents() {
		String sql = "select * from student";
		List<Students> students = null;
		try {
			ps = GetConnection.getMysql().prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			students = new ArrayList<Students>();
			while (resultSet.next()) {
				Students student = new Students();
				student.setStudentId(resultSet.getInt(1));
				student.setStudentName(resultSet.getString(2));
				student.setStudentDob(resultSet.getString(3));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return students;
	}

	/**
	 *
	 * @author Gurpreet
	 * @return all students with hashmap
	 *
	 */

	public HashMap<Integer, Students> getStudents() {
		HashMap<Integer, Students> hashmap = new HashMap<Integer, Students>();
		hashmap.put(1, new Students(101, "gurpeet", "5-sep-1999"));
		hashmap.put(2, new Students(102, "seerat", "12-mar-2000"));
		hashmap.put(3, new Students(103, "pardeep", "2-nov-1999"));
		hashmap.put(4, new Students(104, "navjot", "29-jan-2000"));

		return hashmap;
	}
}