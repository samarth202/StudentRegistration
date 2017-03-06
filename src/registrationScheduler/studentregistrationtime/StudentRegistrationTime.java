/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationScheduler.studentregistrationtime;

/**
 *
 * @author Dell
 */
//package studentregistrationtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class StudentRegistrationTime implements Comparable<StudentRegistrationTime> {
    List<StudentRegistrationTime> studentRegistrationTime = new ArrayList<StudentRegistrationTime>();
    String studentNameObject;
        int timeObject;

    public StudentRegistrationTime(String studentName, int time) {
        studentNameObject = studentName;
        timeObject = time;
    }
    
    public int getRegistrationTime(){
        return timeObject;
    }
    
    public void setRegistrationTIme(int time) {
	timeObject = time;
    }
    
    public String getStudentName() {
         return studentNameObject;
    }
    
    public void setStudentName(String studentName){
        studentNameObject = studentName;
    }
    
    public StudentRegistrationTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(StudentRegistrationTime o) {
        int compareTime=((StudentRegistrationTime)o).getRegistrationTime(); 
        
        return (timeObject - compareTime);
    }
    
    @Override
    public String toString() {
        return "[ Time=" + timeObject + ", Student Name=" + studentNameObject  + "]";
    }
}

