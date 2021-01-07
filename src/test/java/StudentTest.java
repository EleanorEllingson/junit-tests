import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreateStudent(){
        Student Jess = new Student(1L, "Jess");
        Student Tom = null;
        assertNull(Tom);
        assertNotNull(Jess);

    }

    @Test
    public void testStudentFields(){
        Student Jess = new Student(1L, "Jess");
        assertSame(1L, Jess.getId());
        assertSame("Jess", Jess.getName());
        assertSame(0, Jess.getGrades().size());
    }

    @Test
    public void testAddGrade(){
        Student Jess = new Student(1L, "Jess");
        Jess.addGrade(100);
        assertSame(100, Jess.getGrades().get(0));
        Jess.addGrade(90);
        assertSame(90, Jess.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student Jess = new Student(1L, "Jess");
        Jess.addGrade(100);
        Jess.addGrade(80);
        assertEquals(90, Jess.getGradeAverage(), 0);
    }

}
