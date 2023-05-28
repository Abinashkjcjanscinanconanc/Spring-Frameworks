package org.jt.manytomany.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Course {
    @Id
    private int courseId;
    private String courseName;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "stud_cour", joinColumns = @JoinColumn(name = "cour_id"), inverseJoinColumns = @JoinColumn(name = "stud_roll"))
    private List<Student> students;
}
