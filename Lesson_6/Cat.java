package Lesson_6;
import java.util.Objects;

public class Cat implements Comparable<Cat> {
    
    private String name;
    private int age;

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s[%d]", name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Cat)) return false;
        Cat anotherCat = (Cat)obj;
        return name.equals(anotherCat.name) && age == anotherCat.age;
    }

    @Override
    // if obj1.equals(obj2) => obj1.hashCode == obj2.hashCode
    public int hashCode() {
        // using same fields like in equals -> return name.length() + age;
        return Objects.hash(name, age);
    }

    @Override
    // if this.o < o -> -1; if this.o > o -> 1; else 0
    public int compareTo(Cat o) {
        if (age < o.age) return -1;
        else if (age > o.age) return 1;
        return 0;
    }
}
