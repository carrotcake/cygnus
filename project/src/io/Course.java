package io;

import java.util.ArrayList;
import util.CourseList;

/**
 * A class, including its class code, suffix, and prerequisite classes
 *
 * @author me dude lmao
 */
//order of data: (code),(name),(category),(credit),(weight)
public class Course implements Comparable<Course> {

    public final String code, name, credit;
    private ArrayList<String> prereq, category;
    public static ArrayList<Course> courses = new ArrayList<>();
    public final int weight;

    @SuppressWarnings("LeakingThisInConstructor") //dont tell me what to do bud
    public Course(String c, String n, ArrayList<String> prq, String cr, int w) {
        code = c;
        name = n;
        prereq = prq;
        credit = cr;
        weight = w;
    }

    public Course(String c, String n, String cat, String cr, int w) {
        code = c;
        name = n;
        credit = cr;
        category = new ArrayList();
        category.add(cat);
        weight = w;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<String> getPreReqs() {
        return prereq;
    }

    @Override
    public String toString() {
        return code + " - " + name + " - " + credit + " - " + weight;
    }

    @Override
    public int compareTo(Course o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
