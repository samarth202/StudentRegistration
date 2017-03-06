/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationScheduler.course;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Course {

    String courseAll1 = "A";
    String courseAll2 = "B";
    String courseAll3 = "C";
    String courseAll4 = "D";
    String courseAll5 = "E";
    String courseAll6 = "F";
    String courseAll7 = "G";
    String courseAll8 = "H";

    int size = 20;

    HashMap<String, courseDetails> courseMap = new HashMap<String, courseDetails>();
    
    public void initCourse()
    {
        courseMap.put("A", new courseDetails());
        courseMap.put("B", new courseDetails());
        courseMap.put("C", new courseDetails());
        courseMap.put("D", new courseDetails());
        courseMap.put("E", new courseDetails());
        courseMap.put("F", new courseDetails());
        courseMap.put("G", new courseDetails());
        courseMap.put("H", new courseDetails());
    }
    
    public HashMap getCourse()
    {
        return courseMap;
    }
    
    public String getCourseAll1() {
        return courseAll1;
    }

    public void setCourseName1(String courseAll1Object) {
        courseAll1 = courseAll1Object;
    }

    public String getCourseAll2() {
        return courseAll2;
    }

    public void setCourseName2(String courseAll1Object) {
        courseAll2 = courseAll1Object;
    }

    public String getCourseAll3() {
        return courseAll3;
    }

    public void setCourseName3(String courseAll1Object) {
        courseAll3 = courseAll1Object;
    }

    public String getCourseAll4() {
        return courseAll4;
    }

    public void setCourseName4(String courseAll1Object) {
        courseAll4 = courseAll1Object;
    }

    public String getCourseAll5() {
        return courseAll5;
    }

    public void setCourseName5(String courseAll1Object) {
        courseAll5 = courseAll1Object;
    }

    public String getCourseAll6() {
        return courseAll6;
    }

    public void setCourseName6(String courseAll1Object) {
        courseAll6 = courseAll1Object;
    }

    public String getCourseAll7() {
        return courseAll7;
    }

    public void setCourseName7(String courseAll1Object) {
        courseAll7 = courseAll1Object;
    }

    public String getCourseAll8() {
        return courseAll8;
    }

    public void setCourseName8(String courseAll1Object) {
        courseAll8 = courseAll1Object;
    }

//        public boolean isAvailable(String s1){
//            if()
//        }
    public class courseDetails {
        
       int size = 20;
       int availCount = 20;
       int enrolled = 0;
       
       List<String> studentsEnrolled = new ArrayList<String>();
       
       public int getAvailability()
       {
           return availCount;
       }
       public void enroll(String studentName)
       {
           availCount -= 1;
           enrolled += 1;
           studentsEnrolled.add(studentName);
       }
        
    }

}
