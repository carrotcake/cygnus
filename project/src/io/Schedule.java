/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummydata;

/**
 *
 * @author ford.terrell
 */
public class Schedule {
    int[] courses;
    
    /**
     * input an array of classes with each index being the
     * class period it corresponds with. Period 1 is in index 1
     * if there is no class, input -1;
     * @param c 
     */
    public Schedule(int[] c) {
        courses = c;
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < courses.length - 1 ; i++) {
            s += courses[i] + ",";
        }
        return s + courses[courses.length - 1] + "";
    }
}
