package javapro.homework16.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.spi.NumberFormatProvider;

public class CsvFile {
    public static void main(String[] args) {
        String fileName = "src/javapro/homework16/task3/fileTable.csv" ;
        int strings = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                strings++;
            }
            System.out.println("Strings : " + strings);
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }




    }
}
