package org.yup.filewriter;

import java.io.*;

public class FileWriteApp {

    public static void main(String[] args) {

        try {
            FileWriter workingFile = new FileWriter("newestfile.txt");
            BufferedWriter theWriter = new BufferedWriter(workingFile);

            for (int i = 0; i < 81; i++) {
                theWriter.write("this is the number " + (i + 1) + " line in the file\n");
            }
            theWriter.close();

            FileReader findit = new FileReader("newestfile.txt");
            BufferedReader readIt = new BufferedReader(findit);
            System.out.println("it's still working");

            String input;
            while( (input = readIt.readLine()) != null) {

                System.out.println(input);
            }

        } catch (IOException e) {
            System.out.println("creating the file didn't write.");
        }
    }
}
