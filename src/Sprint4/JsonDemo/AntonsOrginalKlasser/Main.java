package Sprint4.JsonDemo.AntonsOrginalKlasser;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        QuestionClient qc = new QuestionClient();

        try {
            String s = qc.getCategories();

            System.out.println(s);

        } catch (IOException | InterruptedException e) {
           e.printStackTrace();
        }
    }
}
