package org.jt.imagedocumentationretrive;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Lob
    private byte[] image;
    @Lob
    private String bond;
}
