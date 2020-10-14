import com.pa.Group;
import com.pa.Person;

public class Lab0Main {

    public static void main(String[] args){
        Person person = new Person(1, "Marta");
        Person person1 = new Person(2, "Teste");

        Group group = new Group(person);

        group.addMember(person);
        group.addMember(person1);

        System.out.println(group.toString());

    }
}
