import dao.CourseDao;
import dao.TeacherDao;
import models.Course;
import models.Teacher;

public class App {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        CourseDao courseDao = new CourseDao();

        Teacher teacher = new Teacher();
        teacher.setLastName("Arbaiza");
        teacher.setFirstName("Eider");
        teacherDao.create(teacher);

        Course course2 = new Course("Programación de Servicios y Procesos");
        course2.setTeacher(teacher);
        courseDao.create(course2);

        System.out.println(teacherDao.find(1));
        System.out.println(courseDao.find(1));
    }
}