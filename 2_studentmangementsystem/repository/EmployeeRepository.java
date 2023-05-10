package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import config.DbConfig;
import model.Employee;

public class EmployeeRepository {
    private static final String EMPLOYEE_TABLE = "employees";
    private final Connection connection;

    public EmployeeRepository() {
        connection = DbConfig.getConnection();
    }

    public void addemployee(Employee employee) {

        var QUERY = """
                INSERT INTO %s (id, name, salary) VALUES (?, ?, ?)
                """.formatted(EMPLOYEE_TABLE);

        try {
            var prepareStatement = connection.prepareStatement(QUERY);
            prepareStatement.setInt(1, employee.getId());
            prepareStatement.setString(2, employee.getName());
            prepareStatement.setDouble(3, employee.getSalary());

            prepareStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getemployees() {
        List<Employee> employees = new ArrayList<>();
        var QUERY = """
                SELECT * FROM %s
                        """.formatted(EMPLOYEE_TABLE);

        try {
            var prepareStatement = connection.prepareStatement(QUERY);

            var resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                employees.add(getEmployee(resultSet));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }

    private Employee getEmployee(ResultSet resultSet) throws Exception {
        var id = resultSet.getInt("id");
        var name = resultSet.getString("name");
        var salary = resultSet.getDouble("salary");

        return new Employee(id, name, salary);
    }
}
