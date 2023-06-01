package org.jt.pagableconcept;

import java.util.List;
import java.util.stream.IntStream;

import org.jt.pagableconcept.model.Product;
import org.jt.pagableconcept.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class PagableconceptApplication implements CommandLineRunner {
	private final ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(PagableconceptApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// var products = getProducts();
		// productRepository.saveAll(products);
		productRepository.findAll(PageRequest.of(1, 10)).forEach(System.out::println);
	}

	private List<Product> getProducts() {
		return IntStream
				.range(1, 101)
				.mapToObj(value -> Product
						.builder()
						.productName("Item - " + value)
						.productPrice(Math.random() * 1000)
						.build())
				.toList();
	}

}
