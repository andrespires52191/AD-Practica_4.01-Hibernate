import dao.TeacherDao;

public class App {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        System.out.println(teacherDao.find(1));

//        Teacher teacher = new Teacher();
//        teacher.setLastName("Arbaiza");
//        teacher.setFirstName("Eider");
//        teacherDao.create(teacher);
//        Course course2 = new Course("Programación de Servicios y Procesos");
//        course2.setTeacher(teacher);
//        courseDao.create(course2);
    }
}