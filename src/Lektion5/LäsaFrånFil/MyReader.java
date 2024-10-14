package Lektion5.LäsaFrånFil;

import java.io.*;
import java.util.Scanner;

public class MyReader {

    public MyReader() throws IOException {

        String tempString;

        try(BufferedReader br = new BufferedReader(
                new FileReader("src/Lektion5/LäsaFrånFil/text.txt"));
        Scanner sc = new Scanner(new FileReader("src/Lektion5/LäsaFrånFil/text.txt"))) {

            while ((tempString = sc.nextLine()) != null) {
                System.out.println(tempString);
            }

            while ((tempString = br.readLine()) != null) {
                System.out.println(tempString);
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args)  {
        try {
            MyReader myReader = new MyReader();
        }
        catch(IOException e){
            System.out.println("felmeddelande");
        }
    }


}
