
package io;

import java.util.ArrayList;

/**
 *  A class, including its class code, suffix, and prerequisite classes
 * 
 * @author me dude lmao
 */
public class Class {
    private String code;
    private ArrayList<String> prereq;
    
    public Class(String c, ArrayList<String> prq){
        code = c;
        prereq = prq; 
    }
    
    public String getCode(){
        return code;
    }
    
    public ArrayList<String> getPreReqs(){
        return prereq;
    }
    
}
