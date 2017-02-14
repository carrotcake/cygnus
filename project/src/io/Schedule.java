
package io;

/**
 *
 * @author ford.terrell
 */
public class Schedule {
    String[] courses;
    private static int PERIODS;
    private static int SEMESTERS;
    /**
     * input an array of classes with each index being the
     * class period it corresponds with. Period 1 is in index 1
     * if there is no class, input -1;
     * @param c 
     */
    public Schedule(int years) {
        if(PERIODS < 1){
            PERIODS = 7;
        }
        if(SEMESTERS < 1){
            SEMESTERS = 2;
        }
        courses = new String[PERIODS * SEMESTERS * years];
        
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < courses.length - 1 ; i++) {
            s += courses[i] + ",";
        }
        return s + courses[courses.length - 1] + "";
    }
    
    public static void setNumberOfPeriods(int periods){
            PERIODS = periods;
    }
    public static void setNumberOfSemesters(int semesters){
            SEMESTERS = semesters;
    }
    
    
}
