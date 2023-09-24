package ru.hogwarts.school.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.hogwarts.school.constants.FacultyServiceTestConstants.*;

class FacultyServiceTest {

    private final FacultyService out = new FacultyService();


    @BeforeEach
    public void beforeEach() {
        out.createFaculty(FACULTY_1);
        out.createFaculty(FACULTY_2);
        out.createFaculty(FACULTY_3);
    }

    @Test
    public void shouldReturnFacultyIfHeIsNew() {
        assertEquals(FACULTY_4, out.createFaculty(FACULTY_4));
    }

    @Test
    public void shouldReturnNullWhenFacultyAlreadyExist() {
        assertNull(out.createFaculty(FACULTY_2));
    }

    @Test
    public void shouldReturnFacultyWhenIdIsCorrect() {
        assertEquals(FACULTY_2, out.getFaculty(ID));
    }

    @Test
    public void shouldReturnCollectionOfAllFaculties() {
        assertIterableEquals(FACULTIES_COLLECTION, out.getAllFaculties());
    }

    @Test
    public void shouldReturnFacultyAndActualCollectionAfterEditWhenDataIsCorrect() {
        MODIFIED_FACULTY.setId(ID);

        assertEquals(MODIFIED_FACULTY, out.editFaculty(MODIFIED_FACULTY));
        assertIterableEquals(MODIFIED_FACULTIES_COLLECTION_AFTER_EDIT, out.getAllFaculties());
    }

    @Test
    public void shouldReturnNullAfterEditWhenNoStudentWithThatId() {
        MODIFIED_FACULTY.setId(INCORRECT_ID);

        assertNull(out.editFaculty(MODIFIED_FACULTY));
    }

    @Test
    public void shouldReturnStudentAndActualCollectionAfterRemoveWhenIdIsCorrect() {
        assertEquals(FACULTY_2, out.removeFaculty(ID));
        assertIterableEquals(MODIFIED_FACULTIES_COLLECTION_AFTER_REMOVE, out.getAllFaculties());
    }

    @Test
    public void shouldReturnNullAfterRemoveWhenNoStudentWithThatId() {
        assertNull(out.removeFaculty(INCORRECT_ID));
    }

    @Test
    public void shouldReturnCollectionOfStudentsWithSpecificAge() {
        assertIterableEquals(SORTED_FACULTIES_COLLECTION_COLOR_1, out.getFacultiesWithColor(COLOR_1));
        assertIterableEquals(SORTED_FACULTIES_COLLECTION_COLOR_2, out.getFacultiesWithColor(COLOR_2));
        assertTrue(out.getFacultiesWithColor(COLOR_3).isEmpty());
    }
}