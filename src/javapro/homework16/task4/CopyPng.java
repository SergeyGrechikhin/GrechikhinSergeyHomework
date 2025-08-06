package javapro.homework16.task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPng {
    public static void main(String[] args) throws IOException {
        copyExample ("src/javapro/homework16/task4/file1.png", "src/javapro/homework16/task4/file2.png");

    }
    private static void copyExample(String fileSource, String fileTarget) throws IOException {
       // String path = "src/javapro/homework16/task4/CopyPng.java" ;
        FileInputStream inputStream = new FileInputStream(fileSource);
        FileOutputStream outputStream = new FileOutputStream( fileTarget);

        int readByte;
        do{
            readByte = inputStream.read();
            if(readByte >= 0) outputStream.write(readByte);{
              outputStream.write(readByte);
            }

        }while(readByte != -1);
        inputStream.close();
        outputStream.close();

        System.out.println("File copied successfully");
    }
}


