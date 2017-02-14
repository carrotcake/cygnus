
package io;

/**
 *
 * @author johnson.benjamin
 */
public class Student implements Comparable<Student> {
    private final int id;
    private String lName, fName;
    private Schedule s;
    private int flags;
    
    /**
     * create a data file with basic student information
     * @param id the student's id number
     * @param lName their last name
     * @param fName their first name
     * @param s the schedule of classes that they have
     */
    public Student(int id, String lName, String fName, int flags) {
        this.id = id;
        this.lName = lName;
        this.fName = fName;
        
    }

    public int compareTo(Student t) {
        return id - t.id;
    }
    
    public String toString() {
        return id + "," + lName + "," + fName + "," + s;
    }
}
