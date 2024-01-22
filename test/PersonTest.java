import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {


    Person P1 = new Person("000001", "Bilbo", "Baggins","Esq.", 1060);
    Person P2 = new Person("000002", "Frodo", "Baggins", "Esq", 1120);
    Person P3 = new Person("000003", "Samwise", "Gamgee", "Esq.", 1125);
    Person P4 = new Person("000004", "Peregrin", "Took", "Esq.", 1126);
    Person P5 = new Person("000005","Meridoc", "Brandybuck", "Esq.",1126);


    @Test
    public void getIDNum() {
        assertEquals("000001", P1.getIDNum());
    }

    @Test
    public void setIDNum() {
        P1.setIDNum("000001");
        assertEquals("000001", P1.getIDNum());
    }

    @Test
    public void getFirstName() {
        assertEquals("Bilbo", P1.getFirstName());
    }

    @Test
    public void setFirstName() {
        P1.setFirstName("Bilbo");
        assertEquals("Bilbo", P1.getFirstName());
    }

    @Test
    public void getTitle() {
        assertEquals("Esq.", P1.getTitle());
    }

    @Test
    public void getLastName() {
        assertEquals("Baggins", P1.getLastName());
    }

    @Test
    public void setLastName() {
        P1.setLastName("Baggins");
        assertEquals("Baggins", P1.getLastName());
    }

    @Test
    public void getYOB() {
        assertEquals(1060, P1.getYOB());
    }

    @Test
    public void setYOB() {
        P1.setYOB(1060);
        assertEquals(1060, P1.getYOB());
    }

    @Test
    public void getFormalName() {
        assertEquals("Esq. Bilbo Baggins", P1.getFormalName());
    }

    @Test
    public void setTitle() {
        P1.setTitle("Esq.");
        assertEquals("Esq.", P1.getTitle());
    }

    @Test
    public void getFullName() {
        assertEquals("Bilbo Baggins", P1.getFullName());
    }

    @Test
    public void getAge() {
        assertEquals("964 ", P1.getAge());
    }







}