package peaksoft.exzemple;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.animals.Dog;
import peaksoft.dao.Person;


public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person=context.getBean("myPerson",Person.class);
        person.callAnimal();
        System.out.println(person);










    }
}
