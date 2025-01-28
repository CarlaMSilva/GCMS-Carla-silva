package br.edu.ifpe.recife.gcms.WebApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HomeControllerTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@GetMapping("/hotfix")
	 public String hotfix() {
	         return "This is a hotfix!";
	     }
}
