import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestClass {

    public static void main (String [] args) {

    }

    public void testPoint1() {
        Person person1 = new Person("Ivan", "Ivanov", 34);
        Person person2 = new Person("Maria", "Ivanova", 40);
        Person person3 = new Person("Petr", "Petrov", 40);
        Person person4 = new Person("Olga", "Petrova", 35);
        Person person5 = new Person("Robert", "Sidorov", 45);
        Person person6 = new Person("Marina", "Sidorova", 39);
        Person person7 = new Person("Marina", "Sidorova", 39);
        Person person8 = new Person("Mark", "Sidoroov", 56);
        Person person9 = new Person("John", "Smith", 57);
        Person person10 = new Person("Kate", "Smith", 49);

        ArrayList<Person> people = new ArrayList<Person>();
        double t1 = System.nanoTime();
        people.add(person1);
        double t2 = System.nanoTime();
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        LinkedList<Person> people1 = new LinkedList<Person>();
        double t3 = System.nanoTime();
        people1.add(person1);
        double t4 = System.nanoTime();
        people1.add(person2);
        people1.add(person3);
        people1.add(person4);
        people1.add(person5);
        people1.add(person6);
        people1.add(person7);
        people1.add(person8);
        people1.add(person9);
        people1.add(person10);


        HashSet<Person> people2 = new HashSet<Person>();
        double t5 = System.nanoTime();
        people2.add(person1);
        double t6 = System.nanoTime();
        people2.add(person2);
        people2.add(person3);
        people2.add(person4);
        people2.add(person5);
        people2.add(person6);
        people2.add(person7);
        people2.add(person8);
        people2.add(person9);
        people2.add(person10);

        TreeSet<Person> people3 = new TreeSet<Person>();
        double t7 = System.nanoTime();
        people3.add(person1);
        double t8 = System.nanoTime();
        people3.add(person2);
        people3.add(person3);
        people3.add(person4);
        people3.add(person5);
        people3.add(person6);
        people3.add(person7);
        people3.add(person8);
        people3.add(person9);
        people3.add(person10);

        System.out.println("ArrayList");
        System.out.println("Time: " + (t2-t1));
        double t9 = System.nanoTime();
        for (Person p:people) {
            System.out.println(p.toString());
        }
        double t10 = System.nanoTime();
        System.out.println("Time: " + (t10-t9));

        System.out.println("LinkedList");
        System.out.println("Time: " + (t4-t3));
        double t11 = System.nanoTime();
        for (Person p:people1) {
            System.out.println(p.toString());
        }
        double t12 = System.nanoTime();
        System.out.println("Time: " + (t12-t11));

        System.out.println("HashSet");
        System.out.println("Time: " + (t6-t5));
        double t13 = System.nanoTime();
        for (Person p:people2) {
            System.out.println(p.toString());
        }
        double t14 = System.nanoTime();
        System.out.println("Time: " + (t14-t13));

        System.out.println("TreeSet");
        System.out.println("Time: " + (t7-t8));
        double t15 = System.nanoTime();
        for (Person p:people3) {
            System.out.println(p.toString());
        }
        double t16 = System.nanoTime();
        System.out.println("Time: " + (t15-t16));
    }
}