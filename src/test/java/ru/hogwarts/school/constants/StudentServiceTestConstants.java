package ru.hogwarts.school.constants;

import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceTestConstants {
    public static final Student STUDENT_1 = new Student("Ivan", 20);
    public static final Student STUDENT_2 = new Student("Alexandr", 25);
    public static final Student STUDENT_3 = new Student("Andrey", 20);
    public static final Student STUDENT_4 = new Student("Pavel", 32);
    public static final Student MODIFIED_STUDENT = new Student("Roman", 55);
    public static final Long ID = 2L;
    public static final Long INCORRECT_ID = 150L;
    public static final int AGE_1 = 20;
    public static final int AGE_2 = 25;
    public static final int AGE_3 = 30;
    public static final ArrayList<Student> STUDENTS_COLLECTION = new ArrayList<>(List.of(
            STUDENT_1,
            STUDENT_2,
            STUDENT_3
    ));
    public static final ArrayList<Student> MODIFIED_STUDENTS_COLLECTION_AFTER_EDIT = new ArrayList<>(List.of(
            STUDENT_1,
            MODIFIED_STUDENT,
            STUDENT_3
    ));
    public static final ArrayList<Student> MODIFIED_STUDENTS_COLLECTION_AFTER_REMOVE = new ArrayList<>(List.of(
            STUDENT_1,
            STUDENT_3
    ));
    public static final ArrayList<Student> SORTED_STUDENTS_COLLECTION_AGE_1 = new ArrayList<>(List.of(
            STUDENT_1,
            STUDENT_3
    ));
    public static final ArrayList<Student> SORTED_STUDENTS_COLLECTION_AGE_2 = new ArrayList<>(List.of(
            STUDENT_2
    ));
}
