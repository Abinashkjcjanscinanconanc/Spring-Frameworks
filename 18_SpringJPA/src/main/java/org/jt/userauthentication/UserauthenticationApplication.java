package org.jt.userauthentication;

import java.util.Scanner;

import org.jt.userauthentication.model.Address;
import org.jt.userauthentication.model.User;
import org.jt.userauthentication.model.UserRole;
import org.jt.userauthentication.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class UserauthenticationApplication implements CommandLineRunner {
	private final UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserauthenticationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// var user = getUser();
		// userRepository.save(user);
		var scanner = new Scanner(System.in);
		System.out.println("Enter username");
		var username = scanner.nextLine();
		System.out.println("Enter password");
		var password = scanner.nextLine();

		var optionalUser = userRepository.findByUsernameAndPassword(username, password);

		if (optionalUser.isPresent()) {
			System.out.println("Welcome " + optionalUser.get().getUsername());
		} else {
			System.out.println("Invalid user!!!");
		}

	}

	private User getUser() {
		return User.builder()
				.username("smruti")
				.password("jt")
				.userRole(UserRole.ADMIN)
				.address(getAddress())
				.build();
	}

	private Address getAddress() {
		return Address.builder()
				.city("bbsr")
				.state("Odisha")
				.country("India")
				.build();
	}
}
