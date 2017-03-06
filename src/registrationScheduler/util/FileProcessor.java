/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationScheduler.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import registrationScheduler.javaapplication33.JavaApplication33;

/**
 *
 * @author Dell
 */
public class FileProcessor {
    JavaApplication33 ja33 = new JavaApplication33();
    public void FileProcessor(BufferedReader buffer1, BufferedReader buffer2) throws FileNotFoundException, IOException {

        String firstLineFile1 = null;
        String firstLineFile2 = null;

        try {
           // System.out.println("Apple.");
//            BufferedReader buffer1 = new BufferedReader(new FileReader(file1));
//            BufferedReader buffer2 = new BufferedReader(new FileReader(file2));
            
            
            if (buffer1.readLine() == null || buffer2.readLine() == null) {
                System.out.println("No errors, and file empty");
                System.exit(0);
            }
            ja33.doFunction(buffer1,buffer2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {

        }
        

    }
    
    

}
