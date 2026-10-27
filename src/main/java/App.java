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

        Teacher teacher_create = teacherDao.create(teacher);

        Course course2 = new Course("Programación de Servicios y Procesos");
        course2.setTeacher(teacher);

        Course course_create = courseDao.create(course2);

        System.out.println(teacherDao.find(1));
        System.out.println(courseDao.find(1));
        System.out.println("Profesor desde curso: " + courseDao.find(1).getTeacher());


        teacher_create.setFirstName("NombreMod");
        teacherDao.update(teacher_create);
        System.out.println("Modificado: " + teacherDao.find(teacher_create.getId()));

        course_create.setTitle("Nuevo titulo");
        courseDao.update(course_create);
        System.out.println("Modificado: " + courseDao.find(course_create.getId()));

        courseDao.delete(course2);
        teacherDao.delete(teacher);
    }
}