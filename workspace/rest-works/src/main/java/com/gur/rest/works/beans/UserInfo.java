package com.gur.rest.works.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
	private Integer id; 
	private String name; 
	private double income; 
	private String email; 
	
	
}
