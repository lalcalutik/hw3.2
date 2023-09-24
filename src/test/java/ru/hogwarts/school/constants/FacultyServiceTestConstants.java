package ru.hogwarts.school.constants;

import ru.hogwarts.school.model.Faculty;

import java.util.ArrayList;
import java.util.List;

public class FacultyServiceTestConstants {
    public static final Faculty FACULTY_1 = new Faculty("Gryffindor", "yellow");
    public static final Faculty FACULTY_2 = new Faculty("Slytherin", "green");
    public static final Faculty FACULTY_3 = new Faculty("Hufflepuff", "yellow");
    public static final Faculty FACULTY_4 = new Faculty("Ravenclaw", "blue");
    public static final Faculty MODIFIED_FACULTY = new Faculty("PhisMath", "black");
    public static final Long ID = 2L;
    public static final Long INCORRECT_ID = 150L;
    public static final String COLOR_1 = "yellow";
    public static final String COLOR_2 = "green";
    public static final String COLOR_3 = "white";
    public static final ArrayList<Faculty> FACULTIES_COLLECTION = new ArrayList<>(List.of(
            FACULTY_1,
            FACULTY_2,
            FACULTY_3
    ));
    public static final ArrayList<Faculty> MODIFIED_FACULTIES_COLLECTION_AFTER_EDIT = new ArrayList<>(List.of(
            FACULTY_1,
            MODIFIED_FACULTY,
            FACULTY_3
    ));
    public static final ArrayList<Faculty> MODIFIED_FACULTIES_COLLECTION_AFTER_REMOVE = new ArrayList<>(List.of(
            FACULTY_1,
            FACULTY_3
    ));
    public static final ArrayList<Faculty> SORTED_FACULTIES_COLLECTION_COLOR_1 = new ArrayList<>(List.of(
            FACULTY_1,
            FACULTY_3
    ));
    public static final ArrayList<Faculty> SORTED_FACULTIES_COLLECTION_COLOR_2 = new ArrayList<>(List.of(
            FACULTY_2
    ));
}
