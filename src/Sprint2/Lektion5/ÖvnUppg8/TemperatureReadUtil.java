package Sprint2.Lektion5.ÖvnUppg8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TemperatureReadUtil {

    //Expected in : "23,3"
    public double parseDouble(String line){
            line = line.trim();
            line = line.replaceAll(",", ".");
            return Double.parseDouble(line);
    }

    public List<String> readFromFile(String path) throws IOException {

        List<String> result = new ArrayList<String>();
        String temp;
        try(BufferedReader buf = new BufferedReader(new FileReader(path))) {

            while ((temp = buf.readLine()) != null) {
                result.add(temp);
            }
        }
        return result;
    }

    public List<Double> getDoubleList(List<String> stringList){
        List<Double> result = new ArrayList<Double>();
        for(String s : stringList){
            result.add(parseDouble(s));
        }
        return result;
    }

/*
    //Expected in : "23,3"
    public double parseDouble(String line){
        try {
            line = line.trim();
            line = line.replaceAll(",", ".");
            return Double.parseDouble(line);
        }
        catch (Exception e){
            System.out.println("Det blev fel");
        }
        return -100;
    }
*/

}
