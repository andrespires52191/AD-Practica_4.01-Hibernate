package dao;

import idao.ICourseDao;
import models.Course;

public class CourseDao extends Dao<Course, Integer> implements ICourseDao {
    @Override
    public Course find(Integer id) {
        Course course = (Course) em.find(Course.class, id);
        return course;
    }
}
