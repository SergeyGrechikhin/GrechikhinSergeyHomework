package javapro.homework16.task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyPng {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the your Source file name ");
        String filename = input.nextLine();
        System.out.println("Enter the your Target file name ");
        String filename2 = input.nextLine();


        copyExample (filename, filename2);

    }
    private static void copyExample(String fileSource, String fileTarget) throws IOException {

       String path = "src/javapro/homework16/task4/files/";


        FileOutputStream outputStream = new FileOutputStream( path + fileTarget);
        FileInputStream inputStream = new FileInputStream( path + fileSource);

        int readByte;

        do {
            readByte = inputStream.read();
            if (readByte >= 0) outputStream.write(readByte);
        } while (readByte != -1);

        inputStream.close();
        outputStream.close();
    }
}


