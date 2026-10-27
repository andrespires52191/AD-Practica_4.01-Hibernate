import dao.CourseDao;
import dao.CourseMateriaDao;
import dao.TeacherDao;
import models.Course;
import models.CourseMaterial;
import models.Teacher;

public class App {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        CourseDao courseDao = new CourseDao();
        CourseMateriaDao courseMateriaDao = new CourseMateriaDao();

//        Teacher teacher = new Teacher();
//        teacher.setLastName("Arbaiza");
//        teacher.setFirstName("Eider");
//
//        Teacher teacher_create = teacherDao.create(teacher);
//
//        Course course2 = new Course("Programación de Servicios y Procesos");
//        course2.setTeacher(teacher);
//
//        Course course_create = courseDao.create(course2);
//
//        System.out.println(teacherDao.find(1));
//        System.out.println(courseDao.find(1));
//        System.out.println("Profesor desde curso: " + courseDao.find(1).getTeacher());
//
//        teacher_create.setFirstName("NombreMod");
//        teacherDao.update(teacher_create);
//        System.out.println("Modificado: " + teacherDao.find(teacher_create.getId()));
//
//        course_create.setTitle("Nuevo titulo");
//        courseDao.update(course_create);
//        System.out.println("Modificado: " + courseDao.find(course_create.getId()));
//
//        courseDao.delete(course2);
//        teacherDao.delete(teacher);
//
//        Course course3 = new Course("Programación de Servicios y Procesos");
//        // Da error porque está configurado que el profesor es obligatorio.
//        //courseDao.create(course3);
//        Teacher teacher3 = new Teacher();
//        teacher3.setFirstName("nombre");
//        teacher3.setLastName("apellido");
//        course3.setTeacher(teacher3);
//        //Da error porque el profesor tiene que guardarse antes que el curso.
//        //courseDao.create(course3);
//        teacherDao.create(teacher3);
//        courseDao.create(course3);


//        Course course4 = new Course("Programación de Servicios y Procesos");
//        Teacher teacher4 = new Teacher();
//        teacher4.setFirstName("nombre");
//        teacher4.setLastName("apellido");
//        course4.setTeacher(teacher4);
//        // Se han modificado los cascades de manera que el profesor se inserta automáticamente
//        courseDao.create(course4);


        Course course4 = new Course("Programación de Servicios y Procesos");
        Teacher teacher4 = new Teacher();
        teacher4.setFirstName("nombre");
        teacher4.setLastName("apellido");
        course4.setTeacher(teacher4);
        course4 = courseDao.create(course4);

        CourseMaterial material = new CourseMaterial();
        material.setUrl("www");
        material.setCourse(course4);
        material = courseMateriaDao.create(material);

        course4.setMaterial(material);
        course4 = courseDao.update(course4);

        System.out.println(material.getId());
        System.out.println(courseMateriaDao.find(material.getId()).getCourse());

        System.out.println(course4.getId());
        System.out.println(courseDao.find(course4.getId()).getMaterial());
    }
}