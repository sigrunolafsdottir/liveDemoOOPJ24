package Sprint1.Lektion1.Bilregister;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PersonTest {

    String namevar = "Sigrun";
    String addressVar = "Hemma";
    int ageVar = 100;
    Person testPerson = new Person(namevar, addressVar, ageVar);

    @Test
    void getName() {
        assertEquals("Personnamn: "+namevar, testPerson.getName());
        assertNotEquals("annatNamn", testPerson.getName());
    }

    @Test
    void setName() {
        String oldName = testPerson.getName();
        assertEquals(oldName, testPerson.getName());
        System.out.println(oldName);
        String newName= "Kalle";
        testPerson.setName(newName);
        assertEquals("Personnamn: "+newName, testPerson.getName());
        assertNotEquals("Personnamn: "+oldName, testPerson.getName());
    }

    @Test
    void getAddress() {
        assertEquals(addressVar, testPerson.getAddress());
        assertNotEquals("annanAdress", testPerson.getAddress());
    }

    @Test
    void setAddress() {
    }

    @Test
    void getAge() {
        assertEquals(ageVar, testPerson.getAge());
        assertNotEquals(3, testPerson.getAge());
    }

    @Test
    void setAge() {
    }
}