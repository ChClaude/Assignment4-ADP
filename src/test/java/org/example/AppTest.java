package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private Student[] myStudents;
    private Collection<Student> studentCollection;
    private Map<String, Student> studentMap;
    private Set<Student> studentSet;
    private List<Student> studentList;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Before
    public void setStudents() {
        myStudents = new Student[4];
        myStudents[0] = new Student("216034027", "Claude", "Milla", 21, "male");
        myStudents[1] = new Student("217034027", "Liana", "Moore", 36, "female");
        myStudents[2] = new Student("218034027", "Leon", "Yale", 26, "male");
        myStudents[3] = new Student("219034027", "Christina", "Amber", 19, "female");

        // Collection Interface
        studentCollection = new LinkedList<>();
        studentCollection.add(myStudents[0]);
        studentCollection.add(myStudents[1]);
        studentCollection.add(myStudents[2]);
        studentCollection.add(myStudents[3]);

        // Map Interface
        studentMap = new HashMap<>();
        studentMap.put("216034027", myStudents[0]);
        studentMap.put("217034027", myStudents[1]);
        studentMap.put("218034027", myStudents[2]);
        studentMap.put("219034027", myStudents[3]);


        // Set Interface
        studentSet = new HashSet<>();
        studentSet.add(myStudents[0]);
        studentSet.add(myStudents[1]);
        studentSet.add(myStudents[2]);
        studentSet.add(myStudents[3]);

        // List Interface
        studentList = new ArrayList<>();
        studentList.add(myStudents[0]);
        studentList.add(myStudents[1]);
        studentList.add(myStudents[2]);
        studentList.add(myStudents[3]);
    }

    @Test
    public void testCollection() {
        assertTrue(studentCollection.contains(myStudents[0]));
    }

    @Test
    public void testMap() {
        assertSame(studentMap.remove("219034027"), myStudents[3]);
    }

    @Test
    public void testSet() {
        assertFalse(studentSet.isEmpty());
    }

    @Test
    public void testList() {
        assertEquals(studentList.lastIndexOf(myStudents[3]), 3);
    }
}
