package test;

import com.pa.Group;
import com.pa.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestGroup {

    Person person1, person2;
    Group group;

    @Before
    public void setUp(){
        person1 = new Person(1, "Marta");
        person2 = new Person(2, "Sara");
        group = new Group(person1);
    }

    @Test
    public void addMember(){

        assertFalse(group.hasMember(person2));

        group.addMember(person1);

        assertTrue(group.hasMember(person1));

    }

}
