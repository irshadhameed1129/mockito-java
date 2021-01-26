package com.example.irshad.IrshadTesting;

import com.example.irshad.IrshadTesting.Domain.User;
import com.example.irshad.IrshadTesting.Repository.UserRepository;
import com.example.irshad.IrshadTesting.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService userService;

	@MockBean
	private UserRepository userRepository;

	@Test
	public void getUserTest() {
		when(userRepository.findAll()).thenReturn(Stream.of(new User(01,"irsh@irsh.com","irshad","hameed","2323","902036")).
				collect(Collectors.toList()));
		assertEquals(1,userService.fetchUserList().size());
	}

}
