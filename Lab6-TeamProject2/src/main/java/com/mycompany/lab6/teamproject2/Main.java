package com.mycompany.lab6.teamproject2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        try {
            File myObj = new File("text.txt");
            Scanner sc = new Scanner(System.in);
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                System.out.println("Answer:");
                String input = sc.nextLine();
                try {
                    File fout = new File("Answers.txt");
                    FileOutputStream fos = new FileOutputStream(fout);
                    OutputStreamWriter osw = new OutputStreamWriter(fos);
                    osw.write(input);
                    osw.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } 
    }
}
