package org.jt.jdbcprogram;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@SpringBootApplication
public class JdbcprogramApplication implements CommandLineRunner {

	private JdbcTemplate jdbcTemplate;
	private Query query;

	public JdbcprogramApplication(JdbcTemplate jdbcTemplate, Query query) {
		this.jdbcTemplate = jdbcTemplate;
		this.query = query;
	}

	public static void main(String[] args) {
		SpringApplication.run(JdbcprogramApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// String SQL = query.insertQuery();
		// String SQL = query.insertDynamicQuery();

		// int affectedRow = jdbcTemplate.update(SQL, 103, "rashmi");
		// System.out.println(affectedRow);

		// String sql = query.selectQuery();
		String sql = query.selectDynamicQuery();

		RowMapper<Student> rowMapper = (resultSet, rowNo) -> new Student(
				resultSet.getInt("roll"),
				resultSet.getString("name"));

		// List<Student> students = jdbcTemplate.query(sql, rowMapper);
		// System.out.println(students);

		Student student = jdbcTemplate.queryForObject(sql, rowMapper, 101);

		System.out.println(student);
	}
}
