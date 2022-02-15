package com.gur.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*
* @author Gurpreet
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
	private int studentId; 
	private String studentName; 
	private String studentDob;
	
}