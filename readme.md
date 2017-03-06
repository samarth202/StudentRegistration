Program to assign courses to students based on their preferences.

Program first registration time and sorts the students in acending order wrt registration time . 

There are 4 core courses (A, B, C, D), and 4 electives (E, F, G, H) being offered in the summer session. The capacity for each course is 20. The total number of students is 50. Each student is required to provide preference for 4 courses, including 2 core courses. The student is asked to provide a preference for each of the courses by listing them in the order of preference.
In the file regTime-input.txt, the input is in the following format (note that the integers 13, 7, and 9 etc. are meant to represent time as integers, so that it is easy for processing). Assume that each student gets a unique registration time. Give highest priority to the student with the lowest time stamp

In the file preference-input.txt, the input is in the following format: (The 4 courses are listed in order of preference). I have assumed that the input does not have an error and always has 2 core courses and 2 electives listed for each student. The input file is whitespace delimited. 
the output.txt file looks like the following:

Student_1 assigned_course_name assigned_course_name assigned_course_name assigned_course_name total_preference_score
Student_2 assigned_course_name assigned_course_name assigned_course_name assigned_course_name total_preference_score
...
Student_3 assigned_course_name assigned_course_name assigned_course_name assigned_course_name total_preference_score

Average preference_score is: X.Y

Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean



-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
:ant -buildfile src/build.xml run -Darg0=preference-input.txt -Darg1=regTime-input.txt -Darg2=output.txt -Darg3=0

