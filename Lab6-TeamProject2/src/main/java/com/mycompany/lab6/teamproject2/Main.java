package com.mycompany.lab6.teamproject2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int qCount = 0;
        int aCount = 0;
        Answer[] arr = new Answer[100];
        Question[] arr1 = new Question[100];
        try {
            File myObj = new File("text.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                arr1[qCount] = new Question(qCount,myReader.nextLine());
                qCount++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } 
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        File fout = new File("Answers.txt");
        try {
            FileOutputStream fos = new FileOutputStream(fout);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            for(int i = 0; i < 5; i ++) {
                int ra = rand.nextInt(qCount);
                System.out.println(arr1[ra]);
                System.out.println("Answer:");
                String input = sc.nextLine();
                arr[aCount]= new Answer(input,aCount);
                aCount++;
                osw.write(input + "\n"); 
            }
            osw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
