import java.util.*;
import java.io.*;

public class Checksum {
    ArrayList<Integer> lineList = new ArrayList<Integer>();
    ArrayList<Integer> diffList = new ArrayList<Integer>();

    public String runCheckSum() {
        // read in file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            //read line of file
            while(reader.readLine() != null) {
            //while line > insert number into arraylist

            //check arraylist for max and main

            // store diff in arraylist

            // clear arraylist



            // add total of diffArrayList
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, input file not found " +
                    fnfe.printStackTrace());
        }
    }
}
