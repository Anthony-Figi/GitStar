/**
 * 
 */
package q4;

import java.util.ArrayList;

import q3.Student;

/**
 * <p>Creates couse objects which hold a class name 
 * and a class list of up to
 * three students, with each students test scores.</p>
 *
 * @author Anthony Figueroa
 * @version 1.0
 */
public class Course {
    /**Holds the course name.*/
    private String courseName;
    
    /**Holds the number of students for each course.*/
    private int numOfStudents;
    
    /**Holds the maximum number of students.*/
    private final int maxNumOfStudents = 3;
    
    /**Holds an array of students.*/
    private ArrayList<Student> classList;
    
    /**
     * Creates the course object.
     * @param clsName Refers to the course name being created.
     */
    public Course(String clsName) {
        courseName = clsName;
        numOfStudents = 0;
        classList = new ArrayList<Student>(maxNumOfStudents);
        
    }
    /**
     * Adds a new student object to the classlist arrayList.
     * @param newStudent the student object.
     */
    public void addStudent(Student newStudent) {
        if (classList.size() <= maxNumOfStudents) {
            classList.add(newStudent);
            numOfStudents++;
        }
    }
    /**
     * Computes the total average of the class.
     * @return returns computes the class average as a double.
     */
    public double average() {
        int overallScore = 0;
        int numberOfStudents = 0;
        
        for (Student currentStudent: classList) {
            overallScore += currentStudent.average();
            numberOfStudents++;
        }
        return (overallScore / numberOfStudents);
    }
    /** Prints out a class list.*/
    public void roll() {
        System.out.println("----------" + courseName + "----------\n");
        for (Student currentStudent: classList) {
            System.out.println("~ " + currentStudent.getName());
        }
        System.out.println("\n" + numOfStudents + " Students in the course.\n");
    }
}
