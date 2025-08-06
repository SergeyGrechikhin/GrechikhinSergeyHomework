package javapro.homework16.task2;

import java.io.*;
import java.util.Scanner;

public class Copy {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file for copy");
        String mainFile =   sc.nextLine();
        System.out.println("Enter where to copy");
        String сopyFile =  sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(mainFile));
             BufferedWriter wr = new BufferedWriter(new FileWriter(сopyFile))){
            String line;
            while ((line = br.readLine()) != null){
                wr.write(line);
                wr.newLine();
            }
            System.out.println("File copied successfully");
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }

}

/*Scanner sc = new Scanner(System.in);

        System.out.println("Enter file for copy");
        String mainFile =   sc.nextLine();
        System.out.println("Enter where to copy");
        String сopyFile =  sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(mainFile));
             BufferedWriter wr = new BufferedWriter(new FileWriter(сopyFile))){
            String line;
            while ((line = br.readLine()) != null){
                wr.write(line);
                wr.newLine();
            }
            System.out.println("File copied successfully");
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        } */
