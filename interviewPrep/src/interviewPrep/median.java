package interviewPrep;

import java.io.*;
import java.util.Collections;
import java.util.Arrays;

public class median {
    public static void main(String args[]) {
        // The name of the file to open.
        String fileName = "C:\\Users\\Tina\\Desktop\\job.txt";


        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();

//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
            String[] arr = line.split(" ");
            int length;
            for ( String ss : arr) {

                //System.out.print(ss+ ", " );
                length = ss.length();
               // System.out.print (length+ ", " );
                //System.out.println();

            }

            String data = "5, 7, 3, 1, 4, 17, 8, 8, 4, 1, 4, 5, 2, 13, 10, 2, 8, 3, 3, 6, 2, 2, 3, 4, 2, 2, 3, 5, 2, 3, 2, 2, 5, 4, 5, 10, 3, 5, 9, 2, 4, 13, 3, 10, 9, 5, 3, 6, 13, 2, 3, 4, 10, 3, 9, 7, 2, 3, 7, 3, 7, 3, 6, 7, 3, 2, 1, 5, 13, 5, 2, 3, 1, 7, 11, 11, 5, 6, 7, 6, 22, 2, 9, 2, 3, 3, 3, 2, 5, 8, 2, 3, 5, 10, 3, 10, 5, 3, 2, 2, 9, 2, 9, 4, 3, 4, 10, 2, 12, 4, 2, 5, 3, 4, 5, 5, 4, 4, 2, 4, 2, 4, 3, 4, 4, 4, 2, 10, 3, 1, 6, 2, 9, 3, 3, 4, 5, 4, 2, 3, 4, 2, 10, 4, 3, 9, 3, 3, 6, 3, 2, 6, 2, 3, 4, 6, 3, 4, 4, 2, 3, 4, 7, 5, 2, 3, 5, 2, 6, 7, 8, 3, 6, 5, 5, 4, 6, 2, 10, 4, 3, 6, 10, 2, 8, 7, 13, 8, 3, 7, 10, 8, 9, 7, 8, 3, 3, 2, 8, 4, 13, 2, 9, 14, 3, 11, 8, 6, 13, 2, 7, 9, 15, 8, 13, 3, 4, 0, 7, 3, 15, 5, 8, 4, 18, 4, 12, 2, 8, 8, 5, 3, 8, 4, 10, 3, 3, 4, 2, 5, 9, 2, 13, 5, 4, 4, 3, 6, 10, 10, 3, 4, 3, 4, 3, 3, 7, 4, 10, 4, 3, 2, 9, 3, 16, 4, 5, 7, 1, 4, 13, 2, 10, 8, 3, 7, 3, 3, 9, 3, 4, 3, 3, 13, 6, 2, 7, 3, 6, 9, 5, 3, 7, 3, 3, 3, 6, 3, 2, 4, 5, 7, 3, 9, 2, 6, 4, 7, 9, 9, 5, 2, 8, 11, 7, 2, 8, 11, 2, 1, 10, 3, 3, 2, 8, 12, 3, 2, 4, 2, 4, 1, 10, 12, 6, 2, 8, 1, 10, 9, 2, 6, 9, 3, 10, 5, 7, 6, 11, 7, 12, 6, 16, 7, 2, 6, 7, 7, 4, 7, 4, 6, 5, 4, 3, 9, 6, 3, 2, 11, 3, 3, 4, 3, 4, 4, 1, 10, 2, 5, 9, 2, 3, 3, 3, 6, 5, 3, 8, 10, 7, 2, 5, 1, 6, 4, 4, 7, 2, 5, 3, 4, 7, 4, 3, 3, 9, 3, 10, 2, 5, 7, 3, 4, 4, 1, 9, 4, 1, 12, 9, 6, 3, 4, 2, 3, 3, 10, 4, 5, 10, 7, 2, 3, 4, 2, 4, 1, 8, 8, 8, 2, 3, 2, 3, 2, 6, 4, 6, 7, 3, 5, 10, 4, 3, 6, 8, 2, 6, 3, 4, 5, 4, 4, 5, 3, 4, 12, 4, 3, 3, 3, 5, 2, 1, 6, 5, 4, 4, 7, 7, 5, 6, 4, 10, 10, 4, 10, 8, 3, 8, 4, 14, 6, 2, 10, 3, 5, 6, 3, 4, 11, 12, 3, 5, 7, 4, 8, 7, 3, 6, 9, 7, 4, 3, 11, 5, 7, 5, 3, 6, 10, 8, 8, 9, 3, 1, 7, 8, 8, 4, 12, 12, 9, 6, 9, 3, 10, 10, 3, 8, 7, 8, 4, 5, 3, 4, 2, 3, 4, 3, 4, 6, 4, 10, 4, 5, 6, 9, 5, 3, 4, 4, 3, 5, 6, 3, 8, 9, 6, 4, 7, 8, 8, 4, 11, 12, 3, 5, 7, 9, 3, 1, 7, 3, 5, 4, 8, 7, 3, 6, 9, 7, 3, 5, 12, 12, 6, 9, 3, 10, 10, 2, 3, 4, 8, 5, 3, 3, 4, 3, 9, 3, 9, 6, 2, 5, 7, 4, 4, 4, 10, 3, 10, 2, 9, 3, 9, 2, 10, 2, 2, 7, 4, 7, 5, 7, 3, 9, 2, 3, 2, 5, 11, 8, 3, 2, 3, 12, 2, 3, 5, 2, 5, 9, 6, 12, 7, 6, 12, 4, 7, 7, 7, 7, 2, 10, 7";
            String[] numbers = data.split(",");
            // Convert the string numbers into Integer and placed it into
            // an array of Integer.
            Integer[] intValues = new Integer[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                intValues[i] = Integer.parseInt(numbers[i].trim());
            }

            // Sort the number in ascending order using the
            // Collections.sort() method.
            Collections.sort(Arrays.asList(intValues));

            // Convert back the sorted number into string using the
            // StringBuilder object. Prints the sorted string numbers.
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < intValues.length; i++) {
                Integer intValue = intValues[i];
                builder.append(intValue);
                if (i < intValues.length - 1) {
                    builder.append(", ");
                }
            }
            System.out.println("Total = " + intValues.length);
            System.out.println("Median = " + intValues[332]);
            System.out.println("After  = " + builder.toString());
                    // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
