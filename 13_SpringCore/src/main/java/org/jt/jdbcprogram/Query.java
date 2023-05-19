package org.jt.jdbcprogram;

import org.springframework.stereotype.Component;

@Component
public class Query {
    private static final String STUDENT_TABLE = "student";

    public String createQuery() {
        return """
                CREATE TABLE student (
                roll INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(40)
                )
                """;
    }

    public String insertQuery() {
        return """
                INSERT INTO %s
                VALUES (102, 'sai')
                """.formatted(STUDENT_TABLE);
    }

    public String insertDynamicQuery() {
        return """
                INSERT INTO %s
                VALUES (?, ?)
                """.formatted(STUDENT_TABLE);
    }

    public String selectQuery() {
        return "SELECT * FROM " + STUDENT_TABLE;
    }

    public String selectDynamicQuery() {
        return """
                    SELECT * FROM %s
                    WHERE roll = ?
                """.formatted(STUDENT_TABLE);
    }
}
