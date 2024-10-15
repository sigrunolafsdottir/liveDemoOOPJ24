package Sprint2.Lektion5.ÖvnUppg8;

import java.io.IOException;
import java.util.List;

public class huvudprogram {

    TemperatureReadUtil reader = new TemperatureReadUtil();
    TemperatureCalculationUtil calc = new TemperatureCalculationUtil();

    public huvudprogram(){

        try {
            List<Double> temps = reader.getDoubleList(reader.readFromFile("src/Lektion5/ÖvnUppg8/temp.txt"));

            System.out.println("Average: "+calc.getAverage(temps));
            System.out.println("Average: "+calc.getHighest(temps));
            System.out.println("Average: "+calc.getLowest(temps));

        } catch (IOException e) {
            System.out.println("File could not be read");
        }
    }


    public static void main(String[] args) {
        huvudprogram h = new huvudprogram();
    }
}
