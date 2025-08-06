package javapro.homework16.task3;

import java.awt.image.DataBufferFloat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.spi.NumberFormatProvider;

public class CsvFile {
    public static void main(String[] args) {
        CsvFileService csvFileService = new CsvFileService();


        String fileName = "src/javapro/homework16/task3/file1.csv" ;
        int mylines = 0 ;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.length() == 0)
                    continue;
                String[] lineArray = line.split(",");
                if(lineArray.length < 3)
                    continue;
                    mylines++;
                    String type = lineArray[0];
                    switch (type){
                        case "Int" -> csvFileService.integers(lineArray);
                        case "Double" -> csvFileService.doubles(lineArray);
                        case "String" -> csvFileService.strings(lineArray);
                        default ->  System.out.println("Invalid choice");
                    }

            }
            System.out.println("Quantity lines : " + mylines);

        }catch (Exception e){
            System.out.println("File not found or format not suitable");
        }









    }

}
