public class Person implements Comparable {

    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int compareTo(Object o) {
        if (this.getAge()>((Person)o).getAge()) return 1;
        else return -1;
    }

    @Override
    public boolean equals (Object o) {
        if (this.getName().equals(((Person)o).getName()) & this.getLastName().equals(((Person)o).getLastName())& this.getAge()==((Person)o).getAge()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
