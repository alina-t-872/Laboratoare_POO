package lab4;

import lab4.database.Database;
import lab4.database.Helpers;

import static lab4.database.Subjects.*;

public class Test {
    public static void main(String[] args) {
        // uncomment these lines when testing the implementation

        // adding people to database
        Helpers.addTeachers();
        Helpers.addStudents();

        // tests
        var testStudent = Database.getDatabase().findAllStudents().get(0);
        var testTeacher = Database.getDatabase().findAllTeachers().get(0);

        // for teacher
        System.out.println("Testing teacher functionalities");
        System.out.println(testTeacher.getAllTeachers());
        System.out.println(testTeacher.getTeachersBySubject(PROGRAMMING_PARADIGMS));
        System.out.println(testTeacher.getTeachersBySubject(DATA_STRUCTURES));
        System.out.println(testTeacher.getAllStudents());
        // testing mutability for teachers
        testTeacher.getAllStudents().get(0).setFirstName("Malone");
        System.out.println(testTeacher.getAllStudents());
        System.out.println(testTeacher.getStudentsBySubject(PROGRAMMING_PARADIGMS));
        System.out.println(testTeacher.getStudentsByAverageGrade());
        System.out.println(testTeacher.getStudentsByGradeForSubject(PROGRAMMING_PARADIGMS));
        System.out.println(testTeacher.getStudentsByGradeForSubject(COMPUTERS_PROGRAMMING));
        System.out.println(testTeacher.getStudentsByGradeForSubject(ASSEMBLY_LANGUAGE_PROGRAMMING));

        // for student
        System.out.println("Testing student functionalities");
        System.out.println(testStudent.getAllTeachers());
        System.out.println(testStudent.getTeachersBySubject(PROGRAMMING_PARADIGMS));
        System.out.println(testStudent.getTeachersBySubject(DATA_STRUCTURES));
        System.out.println(testStudent.getAllStudents());

        // testing immutability for students
        testStudent.getAllStudents().get(0).setFirstName("Ginel");

        // uncomment this, it should throw an error if getAllStudents() from Student is completely immutable
        // testStudent.getAllStudents().add(new Student(testStudent));

        // the data remains the same, without any updates from testStudent (no student named Ginel)
        System.out.println(testStudent.getAllStudents());
        System.out.println(testStudent.getStudentsBySubject(LOCAL_AREA_NETWORKS));
        System.out.println(testStudent.getStudentsByAverageGrade());
        System.out.println(testStudent.getStudentsByGradeForSubject(PROGRAMMING_PARADIGMS));
        System.out.println(testStudent.getStudentsByGradeForSubject(OPERATING_SYSTEMS));
        System.out.println(testStudent.getStudentsByGradeForSubject(COMMUNICATION_PROTOCOLS));

        // checking number of instances
        System.out.println(Database.getNumberOfInstances());
    }
}
