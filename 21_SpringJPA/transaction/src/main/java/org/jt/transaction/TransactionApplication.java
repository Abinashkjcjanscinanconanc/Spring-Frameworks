package org.jt.transaction;

import org.jt.transaction.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class TransactionApplication implements CommandLineRunner {
	private final CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(TransactionApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		var balance = 1000;

		customerRepository.decreaseBalance("51e201dd-70db-4f41-ab90-681bc3efda0a", balance);

		if (balance == 1000) {
			throw new RuntimeException("Payment failed, Money returned");
		}

		customerRepository.increaseBalance("c236453c-52aa-4a5f-bd32-e2b20956ac06", balance);
	}

}
