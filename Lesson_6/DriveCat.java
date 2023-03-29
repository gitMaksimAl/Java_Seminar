package Lesson_6;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashSet;

public class DriveCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 5);
        Cat cat2 = new Cat("Murzik", 5);
        Cat cat3 = new Cat("Barsik", 7);
        Cat cat4 = new Cat("Filimon", 3);

        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        System.out.println(cat1);

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1 == cat2);
        System.out.printf("%d\t%d\n", cat1.hashCode(), cat2.hashCode());

        Set<Cat> cats = new HashSet<>();// make set by equals
        cats.add(cat1);
        cats.add(cat2);
        System.out.println(cats.toString());

        // Tree Set sort objects. Need override compareTo method in class.
        // If have not source code need implement Comparator:
        Comparator<Cat> catComparator = Comparator.comparingInt(Cat::getAge);
        Set<Cat> treeSet = new TreeSet<>(catComparator);
        treeSet.add(cat1);
        treeSet.add(cat2);
        treeSet.add(cat3);
        treeSet.add(cat4);
        System.out.println(treeSet.toString());
    }
}
