package test;

import com.pa.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    Person person;

    @Before
    public void setUp(){
        this.person = new Person(1, "Marta");
    }

    @Test
    public void getId() {
    }

    @Test
    public void setId() {
    }

    @Test
    public void getName() {
        assertEquals("Marta", person.getName());
    }

    @Test
    public void setName() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void testHashCode() {
    }
}
