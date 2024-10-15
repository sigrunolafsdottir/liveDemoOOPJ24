package Sprint1.Lektion2.ÖvnUpg3_Livekodning_PP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class huvudprogram {

    public void printCourseData(Kurs k){
        System.out.println("Kursnamn: "+k.getName());
        System.out.println("Lärare: "+k.getLärare().getName());
        for (Student s: k.getStudenter()){
            System.out.println(s.getName());
        }
        System.out.println();
    }

    public void printCoursesForStudent(Student student, List<Kurs> kurser){
        List<Kurs> träffar = new ArrayList<>();
        for (Kurs k: kurser){
            for(Student s: k.getStudenter()){
                if (s.getName().equals(student.getName())){
                    träffar.add(k);
                }
            }
        }
        for (Kurs t : träffar){
            System.out.println(t.getName());
        }
        System.out.println();
    }

    public huvudprogram() {
        Student s1 = new Student("Anna");
        Student s2 = new Student("Bertil");
        Student s3 = new Student("Cecil");
        Student s4 = new Student("Dorian");
        List<Student> list1 = Arrays.asList(s1, s2, s3, s4);

        Lärare l = new Lärare("Sigrun");

        Kurs k1 = new Kurs("OOPJ", l, list1);
        Kurs k2 = new Kurs("Databaser", l, Arrays.asList(s1, s2, s3));

        List<Kurs> kurser = Arrays.asList(k1, k2);

        printCourseData(k1);
        printCourseData(k2);

        printCoursesForStudent(s1, kurser);
        printCoursesForStudent(s4, kurser);

    }

    public static void main(String[] args) {
        huvudprogram h = new huvudprogram();
    }
}
