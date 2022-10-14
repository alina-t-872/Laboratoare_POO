package task2;

import java.lang.reflect.Array;
import java.util.Random;

public class Internship {
    private String name;
    private String minGrade;
    private Student[] students;

    public void Internship(String name, String minGrade, Student[] students) {
        this.name = name;
        this.minGrade = minGrade;
        this.students = students;
    }

    public Student chooseCandidateRandomly() {
        Random random = new Random();
        return students[random.nextInt(students.length)];
    }

    public void chooseCandidatesForInterview() {
        for (Student i : students) {
            if (i.getGrade() > Float.parseFloat(minGrade)) {
                System.out.println("Candidate " + i.getName() + " got a phone interview at " + name);
            }
        }
    }
}
