package org.jt.manytoonerelation.model;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Course {
    @Id
    private int courseId;
    private String courseName;
    @OneToMany(cascade = { PERSIST, MERGE, DETACH, REFRESH }, mappedBy = "course")
    private List<Teacher> teachers;
}
