/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummydata;

import io.Schedule;
import io.Student;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author ford.terrell
 */
public class StudentMaker {

    public static void createDummyStudents() throws IOException {
        String[] names = new String[]{"John", "Marmion", "Mark", "Blanchard", "Ford", "Terrell", "John", "Doe", "Ben", "Johnson", "Alford", "Ryan", "Caleb", "Aaron", "Charles", "Koonce"};
        Random r = new Random();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {

                int id = r.nextInt(1000000);//a random six-digit number
                int[] courses = new int[8];
                Schedule sch = new Schedule(courses);
                Student stu = new Student(id, names[i], names[j], sch);
                students.add(stu);
            }
        }
        Collections.sort(students);
        FileWriter f = new FileWriter("students.csv");
        
        for (Student s : students) {
            f.write(s.toString() + "\n");
        }
        
        f.close();
    }
}
