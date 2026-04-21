//This class tests the implementation of SummaryGenerator class.
//It creates a BufferedReader to read from the data file purchases.csv,
//  creates an object of SummaryGenerator,
//  uses this object to call createCountsByCountry method and pass 
//     the BufferedReader object br to this method,
//  uses this object to call showCountsByCountry method, which displays the summary.


/*
CIS 2168: Data Structures
Assignment 7: SummaryGeneratorTest.java
Student Name: Mukhammad Nasriddinkhujaev tut11887@temple.edu
*/

package assign7_template;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SummaryGeneratorTest {

    public static void main(String[] args) {
        try {
            //create a BufferedReader to read from file purchases.csv
            BufferedReader br = new BufferedReader(new FileReader("purchases.csv"));
            
            //----Assign 7 Begin ------------//

                //add your own code:
                //  create an object of SummaryGenerator
                //  use this object to call createCountsByCountry method and pass 
                //     the BufferedReader object br to this method.
                //  use this object to call showCountsByCountry  method, which displays the summary
                SummaryGenerator summaryGenerator = new SummaryGenerator(); // created an object of SummaryGenerator
                summaryGenerator.createCountsByCountry(br); // used this object to call createCountsByCountry method and pass the buffer reader object br to this method
                summaryGenerator.showCountsByCountry(); // used this object to call showCountsByCountry method, which displays the summary
                //Hint:
                //* Similar to the code in main() method in class IndexGenerator in the package set_map_use  posted for Lec#19.                

            //----Assign 7  End ------------//              
            
        } catch (IOException ioe) {
            System.out.println("file input error.");
            ioe.printStackTrace();
            System.exit(1);
        }
    }

}

