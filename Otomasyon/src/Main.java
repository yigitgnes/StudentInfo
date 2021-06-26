import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Walter White", "KIM", "555");
        Teacher t2 = new Teacher("Nikola Tesla", "FZK", "240");
        Teacher t3 = new Teacher("Leonhard Euler", "MAT", "101");

        Course kimya = new Course("Kimya", "101", "KIM");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course matematik = new Course("Matematik", "103", "MAT");
        kimya.addTeacher(t1);
        kimya.printTeacherInfo();

        fizik.addTeacher(t2);
        fizik.printTeacherInfo();

        matematik.addTeacher(t3);
        matematik.printTeacherInfo();

        Scanner scanner= new Scanner(System.in);
        Student s1 = new Student("Jesse Pinkman", "123", "12", kimya, fizik, matematik);

        s1.addBulkExamNote(80, 70, 90);
        s1.addVerbalGrade(90, 70, 100);
        s1.isPass();

        Student s2 = new Student("Thomas Edison", "234", "10", kimya, fizik, matematik);
        s2.addBulkExamNote(90, 85, 95);
        s2.addVerbalGrade(85, 85, 85);
        s2.isPass();

        Student s3 = new Student("Louis Cauchy", "345", "11", kimya, fizik, matematik);
        s3.addBulkExamNote(50, 50, 20);
        s3.addVerbalGrade(50, 50, 50);
        s3.isPass();
    }
}
