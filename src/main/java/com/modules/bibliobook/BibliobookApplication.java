package com.modules.bibliobook;

import com.modules.bibliobook.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliobookApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BibliobookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.mostrarMenu();
	}
}
