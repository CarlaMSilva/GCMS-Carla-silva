package br.edu.ifpe.recife.gcms.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
<<<<<<< HEAD

import static org.hamcrest.Matchers.containsString; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc; 
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {

	@Autowired private MockMvc mockMvc;
	
	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/"))
			.andDo(print())
			.andExpect(status().isOk()) 
			.andExpect(content() 
					.string(containsString("Hello, World!")));
		}
	}
=======
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootTest
class WebAppApplicationTests {

	@Test
	void contextLoads() {
	}

}

>>>>>>> 28fe069e0d0c29116742b7ca7ce0d973e93fd4fb
