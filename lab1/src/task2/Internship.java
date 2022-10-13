package task2;

import java.util.ArrayList;
import java.util.Random;

public class Internship {
    private String name;
    private double minGrade;

    /* getter function as required for task4 */
    public String getName() {
        return name;
    }

    /* setter function as required for task4 */
    public void setName(String name) {
        this.name = name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }
    ArrayList<Student> students = new ArrayList<Student>();

    Student chooseCandidateRandomly() {
        Random rand = new Random();
        int noCandidate = rand.nextInt(students.size());
        return students.get(noCandidate);
    }

    void chooseCandidatesForInterview() {
        for (Student stud : students) {
            if (stud.getGrade() >= minGrade)
                System.out.println("Candidate " + stud.getName() + " got a new phone interview at " + name);
        }
    }
}
