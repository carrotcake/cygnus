package io;

/**
 *
 * @author not terrell
 */
public class Schedule {

    String[][] courses;
    public static int PERIODS;
    public static int SEMESTERS;

    /**
     * input an array of classes with each index being the class period it
     * corresponds with. Period 1 is in index 1 if there is no class, input -1;
     *
     * @param c
     */
    public Schedule(int years) {
        if (PERIODS < 1) {
            System.out.println("No value for periods set - defaulting to 7");
            PERIODS = 7;
        }
        if (SEMESTERS < 1) {
            System.out.println("No value for semesters set - defaulting to 2"); //don't want to have to do this, but I feel like someone
            SEMESTERS = 2;                                                      //out there has some serious issues
        }
        courses = new String[years][SEMESTERS * PERIODS];

    }

    public String setCourse(int year, int semester, int period, String code) {
        String oldCourse = courses[year - 1][(semester - 1) * PERIODS + period - 1];
        courses[year - 1][(semester - 1) * PERIODS + period -1] = code;
        return oldCourse;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < courses.length; i++) {
            for (int j = 0; j < courses[i].length; j++) {
                s += courses[i][j] + (j == courses[i].length - 1 ? ";" : ",");
            }
        }
        return s;
    }

    public static void setNumberOfPeriods(int periods) {
        PERIODS = periods;
    }

    public static void setNumberOfSemesters(int semesters) {
        SEMESTERS = semesters;
    }

}
