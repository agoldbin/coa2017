// package coa2017.day2;

import java.util.*;
import java.io.*;

public class Checksum {
    ArrayList<Integer> intList = new ArrayList<Integer>();
    public void runCheckSum() {
        String inputLine;
        String[] tokenArray;
        int min;
        int max;
        int diff = 0;
        int totalDiff = 0;

        // read in file
        try (Scanner s = new Scanner(new FileReader("input.txt"))) {
            while (s.hasNextLine()) {
                String line = s.nextLine();
                Scanner ls = new Scanner(line);
                while(ls.hasNextInt()) {
                    intList.add(ls.nextInt());
                }
                max = Collections.max(intList);
                min = Collections.min(intList);
                diff += (max - min);
                System.out.println(diff);
                intList.clear();

            }

/*        try (BufferedReader reader
                = new BufferedReader(new FileReader("input.txt"))) {

            //read line of file
            while(reader.ready()) {
                inputLine = reader.readLine();
                tokenArray = inputLine.split("\\W");
                for (int i = 0; i < tokenArray.length; i++) {
                    if (tokenArray[i].isEmpty()) {
                    } else {
                        // lineList.add(((tokenArray[i])));
                        if (Integer.parseInt(tokenArray[i]) > max) {
                            max = Integer.parseInt(tokenArray[i]);
                        }
                        if (Integer.parseInt(tokenArray[i]) < min) {
                            min = Integer.parseInt(tokenArray[i]);
                        }
                    }

                    // System.out.println(tokenArray[i]);
                }
                diff = max - min;
                max = 0;
                min = 10000;
                totalDiff += diff;
                System.out.println(totalDiff);
            }
*/
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: input file not found");
            fnfe.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Whoops, something went wrong");
            exception.printStackTrace();
        }
    }
}
