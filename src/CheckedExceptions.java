
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542263
 */
public class CheckedExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       Scanner scan = new Scanner(new File("sample.txt"));
       if(scan.hasNext()){
           System.out.println("File is present and contents will be displayed here");
       }
        
    }
    
}
