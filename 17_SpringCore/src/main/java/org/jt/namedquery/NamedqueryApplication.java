package org.jt.namedquery;

import java.util.List;
import java.util.stream.IntStream;

import org.jt.namedquery.model.Product;
import org.jt.namedquery.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class NamedqueryApplication implements CommandLineRunner {
	private final ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(NamedqueryApplication.class, args);
	}

	private List<Product> getProducts() {
		return IntStream
				.rangeClosed(1, 100)
				.mapToObj(number -> Product
						.builder()
						.productName("Product - " + number)
						.productPrice(number * Math.random() * 1000)
						.build())
				.toList();
	}

	@Override
	public void run(String... args) throws Exception {
		// productRepository.saveAll(getProducts());
		/*
		 * var optionalProduct = productRepository.findByProductName("Product - 1");
		 * if (optionalProduct.isPresent()) {
		 * System.out.println(optionalProduct.get());
		 * } else {
		 * System.out.println("No data");
		 * }
		 */
		productRepository.findAllByProductPriceGreaterThan(10000)
				.forEach(System.out::println);
	}
}
