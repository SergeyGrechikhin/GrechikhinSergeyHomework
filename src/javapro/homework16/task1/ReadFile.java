package javapro.homework16.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String fileRead = "src/javapro/homework16/task1/file1.txt/";
        try (BufferedReader br = new BufferedReader(new FileReader(fileRead))) {
            br.lines().forEach(System.out::println);
        }catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }


    }
}
