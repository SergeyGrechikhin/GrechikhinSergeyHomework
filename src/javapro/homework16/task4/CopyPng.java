package javapro.homework16.task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPng {
    public static void main(String[] args) throws IOException {
        copyExample ("C:\\Users\\GBT H510M_NVDA\\IdeaProjects\\GrechikhinSergeyHomework\\src\\javapro\\homework16\\task4\\file1.png", "C:\\Users\\GBT H510M_NVDA\\IdeaProjects\\GrechikhinSergeyHomework\\src\\javapro\\homework16\\task4\\file2.png");

    }
    private static void copyExample(String fileSource, String fileTarget) throws IOException {

     //   String path = "src/javapro/homework16/task4";


        FileOutputStream outputStream = new FileOutputStream( fileTarget);
        FileInputStream inputStream = new FileInputStream( fileSource);

        int readByte;

        do {
            readByte = inputStream.read();
            if (readByte >= 0) outputStream.write(readByte);
        } while (readByte != -1);

        inputStream.close();
        outputStream.close();
    }
}


