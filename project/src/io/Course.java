package io;

import java.util.ArrayList;
import util.CourseList;

/**
 * A class, including its class code, suffix, and prerequisite classes
 *
 * @author me dude lmao
 */
//order of data: (code),(name),(category),(credit),(weight)

public class Course {

    public final String code, name;
    private ArrayList<String> prereq, category;
    public static CourseList<Course> courses = new CourseList<>();
    public final int credit, weight;
    

    @SuppressWarnings("LeakingThisInConstructor") //dont tell me what to do bud
    public Course(String c, String n, ArrayList<String> prq, int cr,int w) {
        code = c;
        name = n;
        prereq = prq;
        credit = cr;
        weight = w;
    }

    public Course(String c, String n, String cat, int cr,int w) {
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

}
