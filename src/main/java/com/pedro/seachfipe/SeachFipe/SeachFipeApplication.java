package com.pedro.seachfipe.SeachFipe;

import com.pedro.seachfipe.SeachFipe.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeachFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SeachFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.showMenu();
	}
}
