package models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class CourseMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    private String url;

    @OneToOne(optional = false, cascade = CascadeType.MERGE)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

    // Add getters, setters, constructors, toString
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return url;
    }
}
