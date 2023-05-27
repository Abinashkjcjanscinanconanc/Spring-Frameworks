package org.jt.officeapplication.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Student {
    @Id
    private int roll;
    private String name;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
    @JoinColumn(name = "stud_ver_col")
    private Verfication verfication;
}
