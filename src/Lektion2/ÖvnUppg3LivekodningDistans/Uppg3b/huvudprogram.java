package Lektion2.ÖvnUppg3LivekodningDistans.Uppg3b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class huvudprogram {

    public void printClasslist(Kurs k){
        System.out.println(k.getName());
        System.out.println(k.getLärare().getFirstName()+" "+k.getLärare().getLastName());
        for(Student s : k.getStudents()){
            System.out.println(s.getFirstName()+" "+s.getLastName());
        }
    }

    public void hittaKurser(Student studentAttKollaUpp, List<Kurs> kurser){
        List<Kurs> reslutatKurser = new ArrayList<>();
        for(Kurs k : kurser){
            List<Student> studenter = k.getStudents();
            for(Student s :studenter){
                if (s.getFirstName().equals(studentAttKollaUpp.getFirstName())
                && s.getLastName().equals(studentAttKollaUpp.getLastName())){
                    reslutatKurser.add(k);
                }
            }
        }
        System.out.println(studentAttKollaUpp.getFirstName()+" "+studentAttKollaUpp.getLastName());
        for(Kurs k : reslutatKurser){
            System.out.println(k.getName());
        }
    }

    public huvudprogram() {

        Student anna = new Student("Anna", "Andersson");
        Student bertil = new Student("Bertil", "Bengtsson");
        Student cecil = new Student("Cecil", "Cecilsson");

        List<Student> studentsOOPJ = Arrays.asList(anna, bertil, cecil);

        List<Student> studentsDB = Arrays.asList(anna, bertil);

        Lärare sigrun = new Lärare("Sigrun", "Olafsdottir");

        Kurs OOPJ = new Kurs("OOPJ", sigrun, studentsOOPJ);
        Kurs databaser = new Kurs("Databaser", sigrun, studentsDB);

        List<Kurs> kursLista = Arrays.asList(OOPJ, databaser);

       // printClasslist(OOPJ);

        hittaKurser(anna, kursLista);
        System.out.println();
        hittaKurser(cecil, kursLista);



    }

    public static void main(String[] args) {
        huvudprogram h = new huvudprogram();
    }
}
