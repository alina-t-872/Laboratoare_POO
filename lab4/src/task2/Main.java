package task2;

import java.util.*;
import java.util.stream.Collectors;

class Helpers {
    public static final String PROGRAMMING_PARADIGMS = "Programming Paradigms";
    public static final String OBJECT_ORIENTED_PROGRAMMING = "Object Oriented Programming";
    public static final String DATA_STRUCTURES = "Data Structures";
    public static final String PARALLEL_AND_DISTRIBUTED_ALGORITHMS = "Parallel and Distributed Algorithms";
    public static final String COMPILERS = "Compilers";
    public static final String LOCAL_AREA_NETWORKS = "Local Area Networks";
    public static final String ALGORITHMS_DESIGN = "Algorithms Design";
    public static final String COMMUNICATION_PROTOCOLS = "Communication Protocols";
    public static final String OPERATING_SYSTEMS_USAGE = "Operating Systems Usage";
    public static final String LOGIC_DESIGN = "Logic Design";
    public static final String NUMERICAL_METHODS = "Numerical Methods";
    public static final String ALGORITHMS_ANALYSIS = "Algorithms Analysis";
    public static final String ASSEMBLY_LANGUAGE_PROGRAMMING = "Assembly Language Programming";
    public static final String FORMAL_LANGUAGES_AND_AUTOMATA = "Formal Languages and Automata";
    public static final String OPERATING_SYSTEMS = "Operating Systems";
    public static final String COMPUTER_SYSTEMS_ARCHITECTURE = "Computer Systems Architecture";
    public static final String COMPUTER_GRAPHICS = "Computer Graphics";
    public static final String WEB_PROGRAMMING = "Web Programming";
    public static final String COMPUTERS_PROGRAMMING = "Computers Programming";

    public static void addTeachers() {
        Database.getDatabase().addTeachers(Arrays.asList(
                new Teacher("Alex", "Olteanu",
                        Arrays.asList(OBJECT_ORIENTED_PROGRAMMING, DATA_STRUCTURES)),
                new Teacher("Mihnea", "Muraru",
                        Arrays.asList(PROGRAMMING_PARADIGMS, COMPILERS)),
                new Teacher("Irina", "Mocanu",
                        Arrays.asList(DATA_STRUCTURES, COMPUTER_GRAPHICS, FORMAL_LANGUAGES_AND_AUTOMATA)),
                new Teacher("Ciprian", "Dobre",
                        Arrays.asList(COMMUNICATION_PROTOCOLS, PARALLEL_AND_DISTRIBUTED_ALGORITHMS, WEB_PROGRAMMING)),
                new Teacher("Lorina", "Negreanu",
                        Arrays.asList(OBJECT_ORIENTED_PROGRAMMING, FORMAL_LANGUAGES_AND_AUTOMATA)),
                new Teacher("Florin", "Pop",
                        Arrays.asList(COMPUTERS_PROGRAMMING, NUMERICAL_METHODS, COMMUNICATION_PROTOCOLS)),
                new Teacher("Traian", "Rebedea",
                        Arrays.asList(COMPUTERS_PROGRAMMING, ALGORITHMS_ANALYSIS, ALGORITHMS_DESIGN)),
                new Teacher("Matei", "Popovici",
                        Arrays.asList(ALGORITHMS_ANALYSIS, FORMAL_LANGUAGES_AND_AUTOMATA, PROGRAMMING_PARADIGMS)),
                new Teacher("Costin", "Chiru",
                        Arrays.asList(LOGIC_DESIGN, ALGORITHMS_DESIGN)),
                new Teacher("Razvan", "Deaconescu",
                        Arrays.asList(OPERATING_SYSTEMS_USAGE, ASSEMBLY_LANGUAGE_PROGRAMMING, OPERATING_SYSTEMS)),
                new Teacher("Voichita", "Iancu",
                        Arrays.asList(COMPUTER_SYSTEMS_ARCHITECTURE, ASSEMBLY_LANGUAGE_PROGRAMMING)),
                new Teacher("Mihai", "Carabas",
                        Arrays.asList(OPERATING_SYSTEMS, OPERATING_SYSTEMS_USAGE)),
                new Teacher("Nicolae", "Tapus",
                        Arrays.asList(LOCAL_AREA_NETWORKS, COMPUTER_SYSTEMS_ARCHITECTURE))
        ));
    }
    public static void addStudents() {
        Database.getDatabase().addStudents(Arrays.asList(
                new Student(
                        "Florin",
                        "Mihalache",
                        Map.of(
                                PROGRAMMING_PARADIGMS,10,
                                OBJECT_ORIENTED_PROGRAMMING, 9,
                                PARALLEL_AND_DISTRIBUTED_ALGORITHMS, 10,
                                COMPUTER_GRAPHICS, 8,
                                OPERATING_SYSTEMS_USAGE, 9,
                                COMPILERS, 9,
                                COMPUTER_SYSTEMS_ARCHITECTURE, 8)),
                new Student(
                        "Andrei",
                        "Mihu",
                        Map.of(
                                PROGRAMMING_PARADIGMS,9,
                                OBJECT_ORIENTED_PROGRAMMING, 8,
                                COMMUNICATION_PROTOCOLS, 9,
                                COMPUTER_GRAPHICS, 8,
                                COMPUTER_SYSTEMS_ARCHITECTURE, 8,
                                OPERATING_SYSTEMS, 5,
                                LOCAL_AREA_NETWORKS, 7)),
                new Student(
                        "George",
                        "Mocanu",
                        Map.of(
                                PROGRAMMING_PARADIGMS,10,
                                OBJECT_ORIENTED_PROGRAMMING, 10,
                                PARALLEL_AND_DISTRIBUTED_ALGORITHMS, 10,
                                COMPUTER_GRAPHICS, 10,
                                COMPUTER_SYSTEMS_ARCHITECTURE, 10,
                                OPERATING_SYSTEMS, 10,
                                LOCAL_AREA_NETWORKS, 10,
                                ASSEMBLY_LANGUAGE_PROGRAMMING, 10,
                                COMMUNICATION_PROTOCOLS, 10,
                                COMPUTERS_PROGRAMMING, 10)),
                new Student(
                        "Constantin",
                        "Raducanu",
                        Map.of(
                                COMPILERS,10,
                                OBJECT_ORIENTED_PROGRAMMING, 10,
                                PARALLEL_AND_DISTRIBUTED_ALGORITHMS, 9,
                                COMPUTER_GRAPHICS, 10,
                                ALGORITHMS_ANALYSIS, 8,
                                ALGORITHMS_DESIGN, 9,
                                OPERATING_SYSTEMS, 6,
                                ASSEMBLY_LANGUAGE_PROGRAMMING, 5,
                                LOCAL_AREA_NETWORKS, 5,
                                COMPUTERS_PROGRAMMING, 10)),
                new Student(
                        "Sebastian",
                        "Oprea",
                        Map.of(
                                OBJECT_ORIENTED_PROGRAMMING, 5,
                                PARALLEL_AND_DISTRIBUTED_ALGORITHMS, 6,
                                ALGORITHMS_ANALYSIS, 6,
                                ALGORITHMS_DESIGN, 6,
                                OPERATING_SYSTEMS, 6,
                                ASSEMBLY_LANGUAGE_PROGRAMMING, 5,
                                LOCAL_AREA_NETWORKS, 5,
                                COMPUTERS_PROGRAMMING, 6,
                                COMPUTER_SYSTEMS_ARCHITECTURE, 5,
                                LOGIC_DESIGN, 7))
        ));
    }
}

class Database {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    private static int instances = 0;

    // TODO: make it Singleton

    private static Database instanceDatabase = null;

    private Database() {
        instances++;
    }

    public static Database getDatabase() {

        if (instanceDatabase == null) {
            instanceDatabase = new Database();
        }

        return instanceDatabase;
    }

    public static int getNumberOfInstances() {
        // TODO
        return instances;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        // TODO
        List<Teacher> bySubject = new ArrayList<>();

        for (Teacher i : this.teachers) {
            if (i.getSubjects().contains(subject)) {
                bySubject.add(i);
            }
        }

        return bySubject;
    }

    public List<Student> findAllStudents() {
        // TODO
        return students;
    }

    public List<Teacher> findAllTeachers() {
        // TODO
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO

        List<Student> bySubject = new ArrayList<>();

        for (Student i : this.students) {
            if (i.getSubjects().containsKey(subject)) {
                bySubject.add(i);
            }
        }

        return bySubject;
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO

        List<Student> sorted = new ArrayList<>(students);

        sorted.sort(Comparator.comparing(Student::averageGrade));

        return sorted;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        List<Student> sorted = this.getStudentsBySubject(subject);

        sorted.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGradeForSubject(subject) - o2.getGradeForSubject(subject);
            }
        });

        return sorted;
    }
}

class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor
    public Student(Student student) {
        // fill in with the correct instructions
        this.firstName = new String(student.firstName);
        this.lastName = new String(student.lastName);
        this.subjects = new HashMap<>(student.subjects);
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
        // TODO

        double sum = 0;
        int count = 0;

        for (Map.Entry<String, Integer> entry: subjects.entrySet()) {
            sum += entry.getValue();
            count++;
        }

        return sum / count;
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().findAllTeachers());
    }

    public int getGradeForSubject(String subject) {
        // TODO
        return subjects.get(subject);
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().findTeachersBySubject(subject));
    }

    public List<Student> getAllStudents() {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().findAllStudents());
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().getStudentsBySubject(subject));
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().getStudentsByAverageGrade());
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        return Collections.unmodifiableList(Database.getDatabase().getStudentsByGradeForSubject(subject));
    }
}

class Teacher {
    private String firstName;
    private String lastName;
    private List<String> subjects;

    public Teacher(String firstName, String lastName, List<String> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor
    public Teacher(Teacher teacher) {
        // fill in with the correct instructions
        this.firstName = new String(teacher.firstName);
        this.lastName = new String(teacher.lastName);
        this.subjects = new ArrayList<>(teacher.subjects);
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
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

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Teacher> getAllTeachers() {
        // TODO
        return Database.getDatabase().findAllTeachers();
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO
        return Database.getDatabase().findTeachersBySubject(subject);
    }

    public List<Student> getAllStudents() {
        // TODO
        return Database.getDatabase().findAllStudents();
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO
        return Database.getDatabase().getStudentsBySubject(subject);
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO
        return Database.getDatabase().getStudentsByAverageGrade();
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO
        return Database.getDatabase().getStudentsByGradeForSubject(subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();

        // adding people to data base
        Helpers.addTeachers();
        Helpers.addStudents();

        // tests
        var testStudent = Database.getDatabase().findAllStudents().get(0);
        var testTeacher = Database.getDatabase().findAllTeachers().get(0);

        switch(task) {
            case 1:
                System.out.println(testStudent.getFirstName());
                System.out.println(testTeacher.getFirstName());
                break;

            case 2:
                System.out.println(testStudent.averageGrade());
                System.out.println(testStudent.getGradeForSubject("Programming Paradigms"));
                break;

            case 3:
                var testTeacherCopy = new Teacher(testTeacher);
                System.out.println(testTeacherCopy);
                break;

            case 4:
                for (Student student : Database.getDatabase().findAllStudents()) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                System.out.println("------------------------------");
                for (Teacher teacher : Database.getDatabase().findAllTeachers()) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
                }
                System.out.println("------------------------------");
                for (Student student : Database.getDatabase().getStudentsBySubject("Programming Paradigms")) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                System.out.println("------------------------------");
                for (Teacher teacher : Database.getDatabase().findTeachersBySubject("Data Structures")) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
                }
                System.out.println("------------------------------");
                for (Student student : Database.getDatabase().getStudentsByAverageGrade()) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                System.out.println("------------------------------");
                for (Student student : Database.getDatabase().getStudentsByGradeForSubject("Programming Paradigms")) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                break;

            case 5:
                System.out.println("TESTING TEACHER FUNCTIONALITIES:\n");

                for (Teacher teacher : testTeacher.getAllTeachers()) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
                }
                System.out.println("------------------------------");
                for (Teacher teacher : testTeacher.getTeachersBySubject("Programming Paradigms")) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
                }
                System.out.println("------------------------------");
                for (Teacher teacher : testTeacher.getTeachersBySubject("Data Structures")) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
                }
                System.out.println("------------------------------");
                for (Student student : testTeacher.getAllStudents()) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }

                System.out.println("\nTESTING MUTABILITY FOR TEACHERS:\n");

                testTeacher.getAllStudents().get(0).setFirstName("Malone");
                for (Student student : testTeacher.getAllStudents()) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                System.out.println("------------------------------");
                for (Student student : testTeacher.getStudentsBySubject("Programming Paradigms")) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                for (Student student : testTeacher.getStudentsByAverageGrade()) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                System.out.println("------------------------------");
                for (Student student : testTeacher.getStudentsByGradeForSubject("Programming Paradigms")) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                System.out.println("------------------------------");
                for (Student student : testTeacher.getStudentsByGradeForSubject("Computers Programming")) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                System.out.println("------------------------------");
                for (Student student : testTeacher.getStudentsByGradeForSubject("Assembly Language Programming")) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                break;

            case 6:
                System.out.println("TESTING STUDENTS FUNCTIONALITIES:\n");

                for (Teacher teacher : testStudent.getAllTeachers()) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
                }
                System.out.println("------------------------------");
                for (Teacher teacher : testStudent.getTeachersBySubject("Programming Paradigms")) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
                }
                System.out.println("------------------------------");
                for (Teacher teacher : testStudent.getTeachersBySubject("Data Structures")) {
                    System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
                }
                System.out.println("------------------------------");
                for (Student student : testStudent.getAllStudents()) {
                    System.out.println(student.getFirstName() + " " + student.getLastName());
                }
                break;

            case 7:
                try {
                    // testing immutability for students
                    testStudent.getAllStudents().get(0).setFirstName("Ginel");

                    // it should throw an error if getAllStudents() from Student is completely immutable
                    testStudent.getAllStudents().add(new Student(testStudent));
                }
                catch(Exception e) {
                    System.out.println("Students immutability test passed!!! :]");
                }
                break;

            case 8:
                System.out.println(Database.getNumberOfInstances());
                break;
        }

    }
}