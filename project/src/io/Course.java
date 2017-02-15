
package io;

import java.util.ArrayList;
import util.CourseList;

/**
 *  A class, including its class code, suffix, and prerequisite classes
 * 
 * @author me dude lmao
 */
public class Course {
    private final String code;
    private ArrayList<String> prereq;
    public static CourseList<Course> courses = new CourseList<>(); 
    
    @SuppressWarnings("LeakingThisInConstructor") //dont tell me what to do bud
    public Course(String c, ArrayList<String> prq){
        code = c;
        prereq = prq;
        int index = courses.indexOfCode(c);
        courses.add(index,this); //this is ok
    }
    
    public String getCode(){
        return code;
    }
    
    public ArrayList<String> getPreReqs(){
        return prereq;
    }
 
    
}
