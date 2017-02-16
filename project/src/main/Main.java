package main;

import io.Schedule;
import java.io.File;
import java.io.IOException;

/**
 *
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //  StudentMaker.createDummyStudents();
//      Schedule.setNumberOfPeriods(7);
        util.ClassReader.reparseClasses(new File("classes"));
        Schedule s = new Schedule(1);
    }
}
