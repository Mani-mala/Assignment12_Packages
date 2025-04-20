package university;
import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student = new Student("Mani", 101, "ECE");
        Course course = new Course("Digital Signal Processing", "BE192", 4);
        Faculty faculty = new Faculty("Er.Geetha", "ECE", "SP");

        System.out.println("=== Student Information ===");
        student.displayInfo();

        System.out.println("\n=== Course Information ===");
        course.displayCourse();

        System.out.println("\n=== Faculty Information ===");
        faculty.displayFaculty();
    }
}

