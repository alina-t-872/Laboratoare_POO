package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();
    private static Database instance = null;

    private Database() {}
    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public static int getNumberOfInstances() {
        if (instance == null) {
            return 0;
        }
        return 1;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> teachersWithSubject = new ArrayList<>();
        teachers.forEach(teacher -> {
            if (teacher.getSubjects().contains(subject)) {
                teachersWithSubject.add(teacher);
            }
        });

        return teachersWithSubject;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> studentsWithSubject = new ArrayList<>();
        students.forEach(student -> {
            if (student.getSubjects().containsKey(subject)) {
                studentsWithSubject.add(student);
            }
        });

        return studentsWithSubject;
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> studentsSorted = new ArrayList<Student>();
        studentsSorted = students;
        studentsSorted.sort(Comparator.comparing(Student :: averageGrade));

        return studentsSorted;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> studentsSortedBySubject = this.getStudentsBySubject(subject);

        studentsSortedBySubject.sort(new Comparator<Student>() {
            @Override
            public int compare(Student stud1, Student stud2) {
                if(stud1.getGradeForSubject(subject) > stud2.getGradeForSubject(subject)) {
                    return 1;
                } else if (stud1.getGradeForSubject(subject) == stud2.getGradeForSubject(subject)) {
                    return stud1.getFirstName().compareTo(stud2.getFirstName());
                } else  {
                    return -1;
                }
            }
        });

        return studentsSortedBySubject;
    }
}
