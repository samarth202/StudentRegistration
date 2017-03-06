package registrationScheduler.driver;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static registrationScheduler.javaapplication33.JavaApplication33.studentCoursePreferenceObject;
import registrationScheduler.scheduleralgorithm.SchedulerAlgorithm;
import registrationScheduler.util.FileProcessor;

public class Driver {

    public static void main(String args[]) throws IOException, FileNotFoundException {
		int len=args.length;
//System.out.println("length is:"+args.length);
if ((args[0].equalsIgnoreCase("${arg0}")) || (args[1].equalsIgnoreCase("${arg1}"))|| (args[2].equalsIgnoreCase("${arg2}")) || (args[3].equalsIgnoreCase("${arg3}"))) {
			System.err.println("Please enter 4 Arguments as specified in README file.");
			System.exit(0);
		}
	//for(int count=0;count<args.length;count++){
//System.out.println(args[count]);}
		if(len!=4 )
		{
			System.out.println("Please pass 4 arguments");
                	System.exit(0);
		}
               FileProcessor fp = new FileProcessor();
                try {
	                File file1 = new File(args[0]);
            File file2 = new File(args[1]);
                        PrintStream out = new PrintStream(new FileOutputStream(args[2]));
            	    
            System.setOut(out);
            
            
            
            BufferedReader buffer1 = new BufferedReader(new FileReader(file1));
            BufferedReader buffer2 = new BufferedReader(new FileReader(file2));
            
            //System.out.println("HEY");
            fp.FileProcessor(buffer1, buffer2);
            //System.out.println("HEY");
            
        }
       	catch (FileNotFoundException e) {
System.out.println("File not found");
            //e.printStackTrace();
System.exit(1);
        } finally {

        }
        
        //SchedulerAlgorithm sA = new SchedulerAlgorithm();
        //sA.assignCourses(studentCoursePreferenceObject);

    } // end main(...)

} // end public class Driver

