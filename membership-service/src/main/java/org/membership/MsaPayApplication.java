package org.membership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MsaPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaPayApplication.class, args);
		System.out.println("MsaPayApplication started");
	}

}
