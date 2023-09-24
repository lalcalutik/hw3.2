package ru.hogwarts.school.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.hogwarts.school.constants.StudentServiceTestConstants.*;

class StudentServiceTest {

    private final StudentService out = new StudentService();


    @BeforeEach
    public void beforeEach() {
        out.createStudent(STUDENT_1);
        out.createStudent(STUDENT_2);
        out.createStudent(STUDENT_3);
    }

    @Test
    public void shouldReturnStudentIfHeIsNew() {
        assertEquals(STUDENT_4, out.createStudent(STUDENT_4));
    }

    @Test
    public void shouldReturnNullWhenStudentAlreadyExist() {
        assertNull(out.createStudent(STUDENT_2));
    }

    @Test
    public void shouldReturnStudentWhenIdIsCorrect() {
        assertEquals(STUDENT_2, out.getStudent(ID));
    }

    @Test
    public void shouldReturnCollectionOfAllStudents() {
        assertIterableEquals(STUDENTS_COLLECTION, out.getAllStudents());
    }

    @Test
    public void shouldReturnStudentAndActualCollectionAfterEditWhenDataIsCorrect() {
        MODIFIED_STUDENT.setId(ID);

        assertEquals(MODIFIED_STUDENT, out.editStudent(MODIFIED_STUDENT));
        assertIterableEquals(MODIFIED_STUDENTS_COLLECTION_AFTER_EDIT, out.getAllStudents());
    }

    @Test
    public void shouldReturnNullAfterEditWhenNoStudentWithThatId() {
        MODIFIED_STUDENT.setId(INCORRECT_ID);

        assertNull(out.editStudent(MODIFIED_STUDENT));
    }

    @Test
    public void shouldReturnStudentAndActualCollectionAfterRemoveWhenIdIsCorrect() {
        assertEquals(STUDENT_2, out.removeStudent(ID));
        assertIterableEquals(MODIFIED_STUDENTS_COLLECTION_AFTER_REMOVE, out.getAllStudents());
    }

    @Test
    public void shouldReturnNullAfterRemoveWhenNoStudentWithThatId() {
        assertNull(out.removeStudent(INCORRECT_ID));
    }

    @Test
    public void shouldReturnCollectionOfStudentsWithSpecificAge() {
        assertIterableEquals(SORTED_STUDENTS_COLLECTION_AGE_1, out.getStudentsWithAge(AGE_1));
        assertIterableEquals(SORTED_STUDENTS_COLLECTION_AGE_2, out.getStudentsWithAge(AGE_2));
        assertTrue(out.getStudentsWithAge(AGE_3).isEmpty());
    }
}