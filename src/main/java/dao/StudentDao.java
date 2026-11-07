package dao;

import idao.IStudentDao;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import models.Student;

import java.util.List;

public class StudentDao extends Dao<Student, Integer> implements IStudentDao {
    @Override
    public Student find(Integer id) {
        Student student = (Student) em.find(Student.class, id);
        return student;
    }

    public List<Student> listStudentsByCourseId(int courseId) {
        List<Student> courses;

        String HQL_COD = "SELECT s" +
                " FROM Student s" +
                " JOIN s.courses c" +
                " WHERE c.id = :courseId";

        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        TypedQuery<Student> query1 = em.createQuery(HQL_COD, Student.class);
        query1.setParameter("courseId", courseId);
        courses = query1.getResultList();

        entityTransaction.commit();

        return courses;
    }
}
