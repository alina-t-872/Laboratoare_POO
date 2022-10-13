package task2;

public class JobMarket {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.setName("Gigel");
        firstStudent.setGrade(4.5);

        Student secondStudent = new Student();
        secondStudent.setName("Dorel");
        secondStudent.setGrade(5.5);

        Student thirdStudent = new Student();
        thirdStudent.setName("Marcel");
        thirdStudent.setGrade(6.5);

        Student forthStudent = new Student();
        forthStudent.setName("Ionel");
        forthStudent.setGrade(7.5);

        Internship firstInternship = new Internship();
        firstInternship.setName("Google");
        firstInternship.setMinGrade(5.5);
        firstInternship.students.add(firstStudent);
        firstInternship.students.add(secondStudent);
        firstInternship.students.add(thirdStudent);
        firstInternship.chooseCandidatesForInterview();

        Internship secondInternship = new Internship();
        secondInternship.setName("Amazon");
        secondInternship.setMinGrade(6.5);
        secondInternship.students.add(firstStudent);
        secondInternship.students.add(secondStudent);
        secondInternship.students.add(forthStudent);
        secondInternship.chooseCandidatesForInterview();

        Internship thirdInternship = new Internship();
        thirdInternship.setName("Facebook");
        thirdInternship.setMinGrade(7.5);
        thirdInternship.students.add(firstStudent);
        thirdInternship.students.add(thirdStudent);
        thirdInternship.students.add(forthStudent);
        thirdInternship.chooseCandidatesForInterview();

        Internship forthInternship = new Internship();
        forthInternship.setName("Microsoft");
        forthInternship.setMinGrade(8.5);
        forthInternship.students.add(thirdStudent);
        forthInternship.students.add(secondStudent);
        forthInternship.students.add(forthStudent);
        forthInternship.chooseCandidatesForInterview();

        // task3 solution
        Student studentTester1 = new Student();
        studentTester1.setName("Emanuel");
        studentTester1.setGrade(8);

        Student studentTester2 = new Student();
        studentTester2.setName("Emanuel");
        studentTester2.setGrade(8);

        if (studentTester1.equals(studentTester2)) {
            System.out.println("Yea they have the same info!");
        } else {
            System.out.println("Not quite equal!");
        }
    }
}
