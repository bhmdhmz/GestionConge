package com.gasystem;

import static org.junit.Assert.assertNotNull;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gasystem.entities.Service;
import com.gasystem.entities.User;
import com.gasystem.services.ServiceService;
import com.gasystem.services.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GestionAbsenceV1ApplicationTests {

	@Autowired
	private UserService userService= new UserService();
	@Autowired
	private ServiceService serviceService= new ServiceService();
	
	@Before
	public void initDb() {
		
		
	}

	@Test
	public void testRepo() throws ParseException {

	}
	
}
