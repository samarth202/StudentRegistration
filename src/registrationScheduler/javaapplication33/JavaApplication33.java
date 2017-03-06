/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationScheduler.javaapplication33;

/**
 *
 * @author Dell
 */
import registrationScheduler.studentregistrationtime.StudentRegistrationTime;
import registrationScheduler.studentcoursepreference.StudentCoursePreference;
import registrationScheduler.scheduleralgorithm.SchedulerAlgorithm;
import registrationScheduler.util.FileProcessor;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class JavaApplication33 {

    public static List<StudentCoursePreference> studentCoursePreferenceObject = new ArrayList<StudentCoursePreference>();
    public static List<StudentRegistrationTime> studentRegistrationTime = new ArrayList<StudentRegistrationTime>();

    String firstLineFile1 = null;
    String firstLineFile2 = null;
    int count = 0;

    public void doFunction(BufferedReader buffer1, BufferedReader buffer2) throws IOException {
        
        while (count <= 50) {
            while (((firstLineFile1 = buffer1.readLine()) != null) && ((firstLineFile2 = buffer2.readLine()) != null)) {
                firstLineFile1.trim();
                firstLineFile2.trim();
                //System.out.println("BLAH");
                String[] instructionFile1 = firstLineFile1.split(" ");
                String[] instructionFile2 = firstLineFile2.split(" ");
                    
                    StudentRegistrationTime timeFromFile = new StudentRegistrationTime(instructionFile2[0], Integer.parseInt(instructionFile2[1]));
                    StudentCoursePreference courseFromFile = new StudentCoursePreference(instructionFile1[0], instructionFile1[1], instructionFile1[2], instructionFile1[3], instructionFile1[4]);
                    studentRegistrationTime.add(timeFromFile);
                    studentCoursePreferenceObject.add(courseFromFile);
                    //System.out.println(instructionFile2[0]);
            }
            count++;
        }

        Collections.sort(studentRegistrationTime);

//        for(StudentRegistrationTime srt: studentRegistrationTime){
//			System.out.println(srt);
//	   }
        final Map<String, Integer> sortKeys = new HashMap<>();
        int pos = 0;
        for (StudentRegistrationTime i : studentRegistrationTime) {
            sortKeys.put(i.getStudentName(), pos++);
        }

        Comparator<StudentCoursePreference> comp = new Comparator<StudentCoursePreference>() {
            @Override
            public int compare(StudentCoursePreference o1, StudentCoursePreference o2) {
                return sortKeys.get(o1.getStudentName()).compareTo(sortKeys.get(o2.getStudentName()));
            }

        };

        Collections.sort(studentCoursePreferenceObject, comp);
//        for(StudentCoursePreference scp : studentCoursePreferenceObject ) {
//            System.out.println(scp);
//        }
        SchedulerAlgorithm sA = new SchedulerAlgorithm();
        sA.assignCourses(studentCoursePreferenceObject);
    }

    
}
