package com.dgmf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(
        name = "tbl_employee",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "name_unique", // Entity Attribute name
                        columnNames = "name" // DB Column name
                )
        }
)
public class Employee {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_generator"
    )
    @SequenceGenerator(
            name = "employee_generator",
            sequenceName = "employee_sequence_name",
            allocationSize = 1
    )
    private Long id;
    @Column(name = "name", nullable = false, length = 20)
    private String name;
}
