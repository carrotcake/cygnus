package main;

import io.Endorsement;
import io.Schedule;
import util.StudentMaker;
import java.io.IOException;

/**
 *
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //  StudentMaker.createDummyStudents();
//      Schedule.setNumberOfPeriods(7);
        CourseLoader.loadCourses("testcourses");

    }
}
