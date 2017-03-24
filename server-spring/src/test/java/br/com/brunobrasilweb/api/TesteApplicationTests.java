package br.com.brunobrasilweb.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.todomvc.api.ApiRestApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApiRestApplication.class)
@WebAppConfiguration
public class TesteApplicationTests {

	@Test
	public void contextLoads() {
	}

}
