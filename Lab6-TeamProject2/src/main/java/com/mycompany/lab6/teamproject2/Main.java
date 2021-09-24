package com.mycompany.lab6.teamproject2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;

public class Main { //Program execution class
    public static void main(String[] args) {
        int qCount = 0; 
        int aCount = 0; 
        Answer[] arr = new Answer[100]; //creates an array of objects for answers with a limit of 100
        Question[] arr1 = new Question[100]; //creates an array of objects for question with a limit of 100
        try { //creates a file text.txt and reads the questions into an array of objects of questions
            File myObj = new File("text.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                arr1[qCount] = new Question(qCount,myReader.nextLine());
                qCount++;
            }
            myReader.close(); //done reading file text.txt
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } 
        Scanner sc = new Scanner(System.in); 
        Random rand = new Random(); 
        File fout = new File("Answers.txt");
        try { //taking user input for answers, storing them in an array of objects and writing them to an output file
            FileOutputStream fos = new FileOutputStream(fout);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            for(int i = 0; i < 5; i ++) { 
                int ra = rand.nextInt(qCount);
                System.out.println(arr1[ra]);
                System.out.println("Answer:");
                String input = sc.nextLine();
                arr[aCount]= new Answer(input,arr1[ra].getId());
                osw.write(arr[aCount].toString() + "\n"); 
                aCount++;                
            }
            osw.close(); //done answering questions
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
