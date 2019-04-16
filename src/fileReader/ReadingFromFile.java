package fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadingFromFile {


    public static void main(String[] args) {
        FileReader fl = null;
        BufferedReader br = null;


        try {
            fl = new FileReader("/Users/daljeet/Documents/DataStructure_Homework/src/news.txt");
            br = new BufferedReader(fl);
        } catch (FileNotFoundException e) {
            System.out.println("file not found !!!!!");
        }

        String st = "";
        try {
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fl != null) {
                fl = null;
            }
            if (br != null) {
                br = null;
            }


        }

        Scanner scan = new Scanner(System.in);
        System.out.println(" Print whatever is writing");

        String name = scan.nextLine();
            name = scan.nextLine();



        System.out.println(scan);
    }}











