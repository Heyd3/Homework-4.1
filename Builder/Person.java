package People;

import java.util.ArrayList;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person() {
        name = getName();
        surname = getSurname();
    }


    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        if (hasAge() == true)
            this.age++;
    }

    public String setAddressP(String address) {
        this.address = address;
        return address;
    }

    @Override
    public String toString() {
        if ((hasAddress() == true) && (hasAge() == true)) {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        } else {
            if (hasAge() == true) {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", age=" + age +
                        '}';
            } else {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        '}';
            }
        }
    }


    public boolean hasAge() {

        if (age != 0)
            return true;
        else
            return false;
    }

    public boolean hasAddress() {
        if (address != null && !address.isBlank())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname);
        personBuilder.setAddress(this.address);
        return personBuilder;
    }

}
