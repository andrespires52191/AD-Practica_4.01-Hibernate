package models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @NotNull
    private String title;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;
    
    // Add getters, setters, constructors, toString
}
