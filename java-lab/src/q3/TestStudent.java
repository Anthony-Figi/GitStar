package q3;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Anthony Figueroa
 * @version 1.0
 */
public class TestStudent {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int testOne = 1;
        final int testTwo = 2;
        final int testThree = 3;
        //Same for multiple students
        Address school = new Address("3700 Willingdon Ave.", "Burnaby", 
                "BC", "V5G 3H2");

        Address jHome = new Address("21 Jump Street", "Surrey", 
                "BC", "V3A 6K6");
        //Add Student - same school address
        Student john = new Student("John", "Smith", jHome, school, 1, 1, 1);

        Address mHome = new Address("123 Main Street", "North Pole", 
                "NU", "H0H 0H0");
        
        //Add student - same school address
        Student marsha = new Student("Marsha", "Jones", mHome, school, 1, 2, 2);
        
        Address bHome = new Address("56 Hope Road", "Kingston", 
                "JA", "W3E 3D0");
        
        //Add student - setting test scores after
        Student bob = new Student("Bob", "Marley", bHome, school);
        bob.setTestScore(testOne, 2);
        bob.setTestScore(testTwo, 2);
        bob.setTestScore(testThree, 2);
        
        Address dHome = new Address("Endless Road", "Dark Side of the Moon", 
                "Moon", "T3I 9P7");
        //Add student - no test score
        Student david = new Student("David", "Gilmour", dHome, school);
        
        System.out.println(john);
        System.out.println(marsha);
        System.out.println(bob);
        System.out.println(david);
        
        System.out.println("Question three was called and ran sucessfully.");
    }

};
