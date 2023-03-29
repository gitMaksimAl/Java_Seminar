package Homework_6;
import java.util.Locale;
import java.util.Objects;

/*
* Создать класс Person.
* У класса должны быть поля:
* 1. Имя (String)
* 2. Фамилия (String)
* 3. Возраст (продумать тип)
* 4. Пол
* 5*. Придумать свои собственные поля
* 
* Для этого класса
* 1. Реализовать методы toString, equals и hashCode.
* 2*. Придумать собственные методы и реализовать их 
 */

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private char sex;
    private Locale nationality;

    public Person(
        String firstname,
        String lastname,
        int age,
        char sex,
        String language,
        String country
    ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex == 'M' || sex == 'F' ? sex: null;
        this.nationality = new Locale(language, country);
    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public char getSex() {
        return sex;
    }

    public String getLanguage() {
        try {
            return nationality.getISO3Language();
        } catch (Exception e) {
            return "";
        }
    }

    public String getCountryCode() {
        try {
            return nationality.getISO3Country();
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %d y.o. %s",
            firstname,
            lastname,
            age,
            getCountryCode()
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person) || (obj == null)) return false;
        Person another = (Person)obj;
        return  firstname.equals(another.firstname) &&
            lastname.equals(another.lastname) &&
            age == another.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age);
    }

    public void sayHi(Person opponent) {
        System.out.printf("Garbage day! %s\n", opponent.getFirstname());
    }

    public void killPerson(Person target) {
        String targetName = target.getFirstname() + ' ' + target.getLastname();
        target.die();
        target = null;
        System.gc();
        if (target == null) System.out.printf("%s - destroyed by %s.\n",
            targetName,
            firstname);
    }

    private void die() {
        firstname = null;
        lastname = null;
        age = 0;
        sex = '\0';
        nationality = null;
    }
}
