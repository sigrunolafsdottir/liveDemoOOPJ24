package Sprint4.JsonDemo.Omskrivning;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        QuestionClient qc = new QuestionClient();

        try {
            String s = qc.getCategories();
            System.out.println(s);

            ObjectMapper objectMapper = new ObjectMapper();

            // Här skapas Java-objektet som har en lista av alla kategorier
            TriviaCategories triviaCategories = objectMapper.readValue(s, TriviaCategories.class);

            // Skriver ut för att kolla att det verkar rätt
            System.out.println(triviaCategories);
            System.out.println();
            triviaCategories.getTriviaCategories().forEach(System.out::println);

        } catch (IOException | InterruptedException e) {
           e.printStackTrace();
        }
    }
}
