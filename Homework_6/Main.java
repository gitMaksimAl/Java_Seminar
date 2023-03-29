package Homework_6;

/*
 * В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и
 * вывести их на экран 
 */

public class Main {
    public static void main(String[] args) {
        Person[] citizens = new Person[5];

        citizens[0] = new Person(
            "Ivan",
            "Ivanov",
            25,
            'M',
            "ru",
            "Ru");

        citizens[1] = new Person(
            "Petr",
            "Petrov",
            30,
            'M',
            "en",
            "US");

        citizens[2] = new Person(
            "Barbra",
            "Streisand",
            50,
            'F',
            "en",
            "US");

        citizens[3] = new Person(
            "Svetka",
            "Sokolova",
            18,
            'F',
            "ru",
            "Ru");

        citizens[4] = new Person(
            "Pavlik",
            "Morozov",
            15,
            'M',
            "ru",
            "Ru");

        for (int i = 0; i < citizens.length; i++) {
            if (citizens[i].getAge() > 20)
                System.out.println(citizens[i].toString());
        }

        System.out.println(citizens[0].toString());
        citizens[2].sayHi(citizens[1]);
        citizens[2].killPerson(citizens[1]);
    }
}
