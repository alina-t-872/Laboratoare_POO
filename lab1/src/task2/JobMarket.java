package task2;

public class JobMarket {

    public static void main(String[] args) {
        Student gigel = new Student();
        Student dorel = new Student();
        Student marcel = new Student();
        Student ionel = new Student();

        gigel.Student("Gigel", 8.75);
        dorel.Student("Dorel", 6.50);
        marcel.Student("Marcel", 9.98);
        ionel.Student("Ionel", 7.05);

        Internship google = new Internship();
        Internship amazon = new Internship();
        Internship facebook = new Internship();
        Internship microsoft = new Internship();

        google.Internship("Google", "8.50", new Student[]{gigel, dorel, marcel});

        google.chooseCandidatesForInterview();

        // task 3
        Student student1 = new Student();
        Student student2 = new Student();

        student1.Student("eu", 8.5);
        student2.Student("eu", 8.5);

        System.out.printf(String.valueOf(student1.equals(student2)));
        // OBS: chiar daca cele 2 obiecte contin aceleasi date, referintele lor difera
    }
}
