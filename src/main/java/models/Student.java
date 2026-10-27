package models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private LocalDate birthDate;

    boolean wantsNewsletter;

    @ManyToMany(cascade = CascadeType.DETACH,
            mappedBy = "armas")
    List<Course> courses;
}
