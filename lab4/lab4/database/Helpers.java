package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import java.util.Arrays;
import java.util.Map;

import static lab4.database.Subjects.*;

public class Helpers {
    public static void addTeachers() {
        // decomment the below lines
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
