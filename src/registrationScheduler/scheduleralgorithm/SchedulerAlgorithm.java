/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationScheduler.scheduleralgorithm;

/**
 *
 * @author Dell
 */
import registrationScheduler.studentcoursepreference.StudentCoursePreference;
import registrationScheduler.studentregistrationtime.StudentRegistrationTime;
import registrationScheduler.javaapplication33.JavaApplication33;
import registrationScheduler.coursesallocated.CoursesAllocated;
import registrationScheduler.course.Course;
import static java.lang.Double.NaN;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//import java.util.*;

/**
 *
 * @author Dell
 */
public class SchedulerAlgorithm {

    int i;
    StudentCoursePreference sCPObject;
    String studentNameIn;
    String course1In;
    String course2In;
    String course3In;
    String course4In;
    int size;

    Course courseObject = new Course();

    public SchedulerAlgorithm() {
        this.sCPObject = new StudentCoursePreference(studentNameIn, course1In, course2In, course3In, course4In);
        courseObject.initCourse();
    }

    public void assignCourses(List<StudentCoursePreference> SCP) {
        //Iterable<StudentCoursePreference> studentCoursePreferenceObject = null;
        //System.out.print("HEY");
        List<StudentCoursePreference> studentCoursePreferenceObject = JavaApplication33.studentCoursePreferenceObject;
        List<StudentRegistrationTime> studentRegistrationTime = JavaApplication33.studentRegistrationTime;
        List<CoursesAllocated> coursesAllocated = CoursesAllocated.coursesAllocated;

        HashMap<String, Course.courseDetails> courseMap = courseObject.getCourse();
        
        //int score = 0 , sum = 0;
        
        //System.out.println(studentCoursePreferenceObject);
        //System.out.println(studentRegistrationTime);
        double sum = 0;
        for (StudentCoursePreference p : JavaApplication33.studentCoursePreferenceObject) {
            //System.out.println(studentCoursePreferenceObject);

            //System.out.println(p.getStudentName());
            String studentName = p.getStudentName();
            int unenrolledCount = 0;
            List<String> coursesEnrolled = new ArrayList<String>();
            List<String> unavailablePrefferedCourse = new ArrayList<String>();
            
            
            for (int i = 0; i < p.getCourseList().size(); i++) {

                String courseName = p.getCourseList().get(i).toString();

                //System.out.println(courseName);
                Course.courseDetails courseDetails = courseMap.get(courseName);

                if (courseDetails.getAvailability() <= 0) {
                    unenrolledCount += 1;
                    unavailablePrefferedCourse.add(courseName);

                } else {
                    courseDetails.enroll(studentName);
                    coursesEnrolled.add(courseName);
                    sum += i;
                }
                
                courseMap.replace(courseName, courseDetails);

            }

            if (unenrolledCount > 0) {
                int scoreUnPreffered = 5;
                for (String key : courseMap.keySet()) {
                    //for (String uapc : unavailablePrefferedCourse) {
                    if (!unavailablePrefferedCourse.contains(key) && !coursesEnrolled.contains(key)) {
                        //if (!uapc.equals(key)) {
                        Course.courseDetails courseDetails = courseMap.get(key);
                        
                        if (courseDetails.getAvailability() > 0) {
                            courseDetails.enroll(studentName);
                            coursesEnrolled.add(key);
                            courseMap.replace(key, courseDetails);
                        }
                        
                        unenrolledCount -= 1;
                        sum += scoreUnPreffered + 1;
                        //}
                    }
                    if (unenrolledCount <= 0) {
                        break;
                    }
                }
            }
            else if(unenrolledCount==0){
                int scoreUNPREFERRED=6;
                sum +=scoreUNPREFERRED + 1;
            }
            
            System.out.print(studentName);
            for (String course : coursesEnrolled) {
                System.out.print(" " + course+ " " );
                //System.out.println(sum);
            }
            
                        
            System.out.println("");

        }
        double score = sum / 50;
            System.out.println("Average Preference score is  " + score);

        System.out.println("-----------------");

    }

}
