package q3;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Anthony Figueroa
 * @version 1.0
 */
public class Student {
    /** The max number of tests. */
    private static final int MAX_TEST = 3;
    
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /** Holds the student test score for test one. */
    private int testOne;
    
    /** Holds the student test score for test two. */
    private int testTwo;
    
    /** Holds the student test score for test three. */
    private int testThree;
    
    /**
    * Constructor: Sets up this student with the specified values.
    * @param first The first name of the student
    * @param last The last name of the student
    * @param home The home address of the student
    * @param school The school address of the student
    * @param scoreOne holds the score for the first test.
    * @param scoreTwo holds the test score for the second test.
    * @param scoreThree holds the 
    */
    public Student(String first, String last, 
            Address home, Address school, 
            int scoreOne, int scoreTwo, int scoreThree) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testOne = scoreOne;
        testTwo = scoreTwo;
        testThree = scoreThree;
    }
    /**
     * Constructor: Sets up this student with the specified values.
     * @param first The first name of the student
     * @param last The last name of the student
     * @param home The home address of the student
     * @param school The school address of the student
     */
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testOne = 0;
        testTwo = 0;
        testThree = 0;
    }
    /**
     *consturctor that sets the students tests scores.
     *@param testNum selects which test score to change. 
     * @param score sets the  test score.
     */
    public void setTestScore(int testNum, int score) {
        if (testNum == 1) {
            testOne = score;
        } else if (testNum == 2) {
            testTwo = score;
        } else if (testNum == MAX_TEST) {
            testThree = score;
        }
    }
    /**
     * Returns the students tests score as an integer.
     * @param testNum selects which test score to return.
     * @return returns the selected test score.
     */
    public int getTestScore(int testNum) {
        if (testNum == 1) {
            return testOne;
        } else if (testNum == 2) {
            return testTwo;
        } else if (testNum == MAX_TEST) {
            return testThree;
        } else { 
            return 0;
        }
    }
    /**
     * Computes the average of the three tests for that one student.
     * @return returns the average as a double.
     */
    public double average() {
        return ((testOne + testTwo + testThree) / MAX_TEST);
    }
    /**
    * Returns a string description of this Student object.
    * @return formatted name and addresses of student
    */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address: " + homeAddress + "\n";
        result += "School Address: " + schoolAddress + "\n";
        result += "Test 1: " + getTestScore(1) + "\n";
        result += "Test 2; " + getTestScore(2) + "\n";
        result += "Test 3: " + getTestScore(MAX_TEST) + "\n";
        result += "Average: " + average() + "\n";
        
        return result;
    }
    /**
     * Returns the students full name as a string.
     * @return returns the string.
     */
    public String getName() {
        return firstName + " " + lastName;
    }
}
