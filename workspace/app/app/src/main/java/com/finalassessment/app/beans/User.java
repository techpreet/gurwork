package com.finalassessment.app.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="User")
public class User {
	@Id
	private int userId;
	
	 private String fName;
	 private String lName;
	 private String email;
	 private String password;
	 private long phoneNo;
	 private String address;
	 private String dob;

}
