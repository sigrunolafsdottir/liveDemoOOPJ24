package Lektion4.StenSaxPåse;

public class GameUtil {


    public Symbol getRandomSymbol(){
        int symbolIndex = getRandomNumber();
        return Symbol.values()[symbolIndex];
    }

    //returnerar tal mellan 0 och 2
    public int getRandomNumber(){
        return (int) (Math.random()*3);
    }

}
