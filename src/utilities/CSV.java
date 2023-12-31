package utilities;

import java.io.*;
import java.util.*;

public class CSV {
    // This function will read data from a CSV file and return as a list
    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            throw new RuntimeException(e);
        }
        return data;
    }
}
