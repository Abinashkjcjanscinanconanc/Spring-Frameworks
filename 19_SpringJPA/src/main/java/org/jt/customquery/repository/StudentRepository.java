package org.jt.customquery.repository;

import org.jt.customquery.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Modifying
    @Query("UPDATE Student SET fee = fee + :increment WHERE fee > :currentfee ")
    int updateFee(@Param("currentfee") double currentFee, double increment);

    @Modifying
    @Query(value = "UPDATE student SET name = :newName WHERE name = :oldName", nativeQuery = true)
    int updateName(String oldName, String newName);
}
