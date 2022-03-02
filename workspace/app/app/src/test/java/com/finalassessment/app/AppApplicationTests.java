package com.finalassessment.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.finalassessment.app.beans.User;
import com.finalassessment.app.repo.UserRepository;
import com.finalassessment.app.service.UserService;

@SpringBootTest
class AppApplicationTests {

	@SpringBootTest
	class TrainerServiceApplicationTests {

		@Autowired
		private UserService service;

		@MockBean
		private UserRepository repo;

		@BeforeEach
		public void setUp() {
			System.out.println("+++++++++-----------------------------------------------------------------+++++++++");
			Optional<User> user = Optional
					.of(new User(101,"Gurpreet","singh","gur@gmail.com","pass",98576721,"patiala","05-sep-1999"));
			List<User> list = Arrays
					.asList(new User(101,"Gurpreet","singh","gur@gmail.com","pass",98576721,"patiala","05-sep-1999"));

			// mocked object
			when(repo.findById(101)).thenReturn(user);
			when(repo.findAll()).thenReturn(list);
			when(repo.save(user.get())).thenReturn(user.get());
			when(repo.insert(user.get())).thenReturn(user.get());

		}

		

		@Test
		@DisplayName("get all the user and list should give you an array of 1 user")
		void getAllUsers() {
			assertEquals(1, service.getAllUsers().size());
		}

		
		@Test
		@DisplayName("save the valid user and acknowledge the same")
		void saveUserToTheServer() {
			User user = new User(101,"Gurpreet","singh","gur@gmail.com","pass",98576721,"patiala","05-sep-1999");

			assertNotNull(service.saveUser(user));
		}

		@Test
		@DisplayName("update user data")
		void updateTrainerToTheServer() {
			User trainer = new User(101,"Gurpreet","singh","gur@gmail.com","pass",98576721,"patiala","05-sep-1999");
			User updateTrainer = service.updateUser(trainer);
			assertNotNull(updateTrainer);
		}
		
		@Test
		@DisplayName("get user by there id")
		void getUserById() {
			Optional<User> UserById = service.getUserById(101);
			assertNotNull(UserById);
		}



	}

}
