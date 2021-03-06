package com.gur.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gur.beans.Question;
import com.gur.connection.GetConnection;

@Component
public class QuestionDAO {

	// you might have connect with DB to get the questions
	PreparedStatement ps = null;


	public boolean saveQuestion(Question question) {
		System.out.println("Question " + question.getQuestion());
		System.out.println("Option 1 " + question.getOption1());
		System.out.println("Option 2 " + question.getOption2());
		System.out.println("Option 3 " + question.getOption3());
		System.out.println("Option 4 " + question.getOption4());
		
		return question.getQuestion().length() > 6;

	}
	
	
	public List<Question> getAllQuestion() {
		String sql ="select * from questions";
		List<Question> questions = null;
		try {
			ps = GetConnection.getMysql().prepareStatement(sql); 
			ResultSet resultSet = ps.executeQuery();
			questions = new ArrayList<Question>(); 
			while(resultSet.next()) {
				Question question = new Question(); 
				question.setQuestion(resultSet.getString(1));
				question.setOption1(resultSet.getString(2));
				question.setOption2(resultSet.getString(3));
				question.setOption3(resultSet.getString(4));
				question.setOption4(resultSet.getString(5));
				
				questions.add(question);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return questions; 
	}
	
	
	
	
}
