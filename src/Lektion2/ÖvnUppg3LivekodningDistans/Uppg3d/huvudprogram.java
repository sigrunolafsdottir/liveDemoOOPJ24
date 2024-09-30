package Lektion2.ÖvnUppg3LivekodningDistans.Uppg3d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class huvudprogram {

    public void hittaKurserFörStudent(Student s, List<Deltagande> deltagande){
        List<Kurs> träffar = new ArrayList<>();
        for(Deltagande d : deltagande){
            if (d.getS().getFirstName().equals(s.getFirstName()) &&
                    d.getS().getLastName().equals(s.getLastName())){
                träffar.add(d.getK());
            }
        }
        for(Kurs k : träffar){
            System.out.println(k.name);
        }
    }

    public void hittaStudenterFörKurs(Kurs k, List<Deltagande> deltagande){
        List<Student> deltagare = new ArrayList<>();
        for(Deltagande d : deltagande){
            if (d.getK().getName().equals(k.getName())){
                deltagare.add(d.getS());
            }
        }
        for(Student s : deltagare){
            System.out.println(s.getFirstName());
        }
    }


    public huvudprogram() {

        Student anna = new Student("Anna", "Andersson");
        Student bertil = new Student("Bertil", "Bengtsson");
        Student cecil = new Student("Cecil", "Cecilsson");

        Lärare sigrun = new Lärare("Sigrun", "Olafsdottir");

        Kurs OOPJ = new Kurs("OOPJ", sigrun);
        Kurs databaser = new Kurs("Databaser", sigrun);

        Deltagande d1 = new Deltagande(anna, OOPJ);
        Deltagande d2 = new Deltagande(anna, databaser);
        Deltagande d3 = new Deltagande(bertil, OOPJ);
        Deltagande d4 = new Deltagande(bertil, databaser);
        Deltagande d5 = new Deltagande(cecil, OOPJ);

        List<Deltagande> deltagande = Arrays.asList(d1, d2, d3, d4, d5);

        hittaKurserFörStudent(anna, deltagande);
        System.out.println();
        hittaKurserFörStudent(cecil, deltagande);
        System.out.println();
        System.out.println();
        hittaStudenterFörKurs(OOPJ, deltagande);
        System.out.println();
        hittaStudenterFörKurs(databaser, deltagande);

    }

    public static void main(String[] args) {
        huvudprogram h = new huvudprogram();
    }
}
