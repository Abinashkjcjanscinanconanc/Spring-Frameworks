package org.jt.manytoonerelation.model;

import static jakarta.persistence.CascadeType.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Teacher {
    @Id
    private int teacherId;
    private String teacherName;
    @ManyToOne(cascade = { PERSIST, MERGE, DETACH, REFRESH })
    private Course course;
}
