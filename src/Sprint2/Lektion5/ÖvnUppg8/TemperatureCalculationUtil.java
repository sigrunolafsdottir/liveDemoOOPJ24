package Sprint2.Lektion5.ÖvnUppg8;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TemperatureCalculationUtil {

    public double getAverage(List<Double> list){
        double sum = 0;
        for (double d : list)   {
            sum += d;
        }
        return sum/list.size();
    }

    public double getHighest(List<Double> list){
        return Collections.max(list);
    }

    public double getLowest(List<Double> list){
        return Collections.min(list);
    }


}
