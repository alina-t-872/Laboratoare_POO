package lab4.people;

import lab4.database.Database;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collections;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public Student(Student student) {
        this.firstName = new String(student.firstName);
        this.lastName = new String(student.lastName);
        this.subjects = new HashMap<>();
        this.subjects.putAll(student.subjects);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        AtomicInteger sumGrades = new AtomicInteger();
        subjects.forEach((subject, grade) -> {
            sumGrades.addAndGet(grade);
        });
        double average = sumGrades.doubleValue() / subjects.size();
        return average;
    }

    public List<Teacher> getAllTeachers() {
        return Collections.unmodifiableList(Database.getDatabase().findAllTeachers());
    }

    public int getGradeForSubject(String subject) {
        return subjects.get(subject);
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        return Collections.unmodifiableList(Database.getDatabase().findTeachersBySubject(subject));
    }

    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(Database.getDatabase().findAllStudents());
    }

    public List<Student> getStudentsBySubject(String subject) {
        return Collections.unmodifiableList(Database.getDatabase().getStudentsBySubject(subject));
    }

    public List<Student> getStudentsByAverageGrade() {
        return Collections.unmodifiableList(Database.getDatabase().getStudentsByAverageGrade());
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        return Collections.unmodifiableList(Database.getDatabase().getStudentsByGradeForSubject(subject));
    }
}
