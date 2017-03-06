/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationScheduler.studentcoursepreference;

/**
 *
 * @author Dell
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package studentcoursepreference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import registrationScheduler.studentregistrationtime.StudentRegistrationTime;
//import javaapplication33.JavaApplication33;
/**
 *
 * @author Dell
 */
public class StudentCoursePreference {
        String studentNameObject;
        String courseObject1, courseObject2 , courseObject3, courseObject4;
        List<String> CourseList = new ArrayList<String>(); 
        

    public StudentCoursePreference(String studentName, String course1, String course2, String course3, String course4) {
        studentNameObject = studentName;
        courseObject1 = course1;
        courseObject2 = course2;
        courseObject3 = course3;
        courseObject4 = course4;
        CourseList.add(courseObject1);
        CourseList.add(courseObject2);
        CourseList.add(courseObject3);
        CourseList.add(courseObject4);
        //timeObject = time;
    }
    
    public List getCourseList()
    {
        return CourseList;
        
    }
    
    public String getStudentName() {
         return studentNameObject;
    }
    
    public void setStudentName(String studentName){
        studentNameObject = studentName;
    }
    
    public String getCourseName1(){
        return courseObject1;
    }
    
    public void setCourseName1(String courseName1){
        courseObject1 = courseName1;
    }
    
    public String getCourseName2(){
        return courseObject2;
    }
    
    public void setCourseName2(String courseName2){
        courseObject2 = courseName2;
    }
    
    public String getCourseName3(){
        return courseObject3;
    }
    
    public void setCourseName3(String courseName3){
        courseObject3 = courseName3;
    }
    
    public String getCourseName4(){
        return courseObject4;
    }
    
    public void setCourseName4(String courseName4){
        courseObject4 = courseName4;
    }
    @Override
    public String toString() {
        return  "[ Student Name=" + studentNameObject  + "] " + courseObject1 + " " + courseObject2 ;
    }

          
          
        
    
}

