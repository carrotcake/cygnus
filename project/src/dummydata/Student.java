
package dummydata;

/**
 * -order of data: (id num),(last name)?,(first name)?,(classes)
 *		classes: {(code 1),(code 2), ... , (class code 7)}
 * @author ford.terrell
 */

public class Student implements Comparable<Student> {
    
    private int id;
    private String lName, fName;
    private Schedule s;
    
    /**
     * create a data file with basic student information
     * @param id the student's id number
     * @param lName their last name
     * @param fName their first name
     * @param s the schedule of classes that they have
     */
    public Student(int id, String lName, String fName, Schedule s) {
        this.id = id;
        this.lName = lName;
        this.fName = fName;
        this.s = s;
    }

    public int compareTo(Student t) {
        return id - t.id;
    }
    
    public String toString() {
        return id + "," + lName + "," + fName + "," + s;
    }
}
