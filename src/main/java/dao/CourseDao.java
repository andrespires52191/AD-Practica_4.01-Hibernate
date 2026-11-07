package dao;

import idao.ICourseDao;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import models.Course;

import java.util.List;

public class CourseDao extends Dao<Course, Integer> implements ICourseDao {
    @Override
    public Course find(Integer id) {
        Course course = (Course) em.find(Course.class, id);
        return course;
    }

    public List<Course> listCoursesByTeacherLastName(String teacherLastName) {
//        String HQL_COD = "FROM teachers as t WHERE t.lastName = :lastName";
//        EntityTransaction entityTransaction = em.getTransaction();
//        entityTransaction.begin();
//        Query query1 = em.createQuery(HQL_COD);
//        query1.setParameter("lastName", teacherLastName);
//        entityTransaction.commit();

        List<Course> courses;

        String HQL_COD = "SELECT DISTINCT c" +
                " FROM Course as c" +
                " WHERE c.teacher.lastName = :lastName";

        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        TypedQuery<Course> query1 = em.createQuery(HQL_COD, Course.class);
        query1.setParameter("lastName", teacherLastName);
        courses = query1.getResultList();

        entityTransaction.commit();

        return courses;
    }
}
