package Lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ListBenchmark {
    public static final int SIZE = 1_000_000;
    public static final long HEAD_TIMER = 50_000;
    public static final long LAST_TIMER = 5_000_000; // not recommend for head timer

    public static void main(String[] args) {
        Integer[] data = new Integer[SIZE];
        for (int i = 0; i < data.length; i++)
            data[i] = ThreadLocalRandom.current().nextInt(10000);

        ArrayList<Integer> listArray = createArrayList(data);
        LinkedList<Integer> linkedList = createLinkedList(data);

        long arrayFromHead = timerFromHead(listArray, HEAD_TIMER);
        long linkedFromHead = timerFromHead(linkedList, HEAD_TIMER);

        System.out.printf("%d iteration:", HEAD_TIMER);
        System.out.printf("array, change head item: %d\n", arrayFromHead);
        System.out.printf("linked, change head item: %d\n", linkedFromHead);

        System.out.printf("%d iteration:", LAST_TIMER);
        long arrayFromlast = timerFromLast(listArray, LAST_TIMER);
        long linkedFromLast = timerFromLast(linkedList, LAST_TIMER);

        System.out.printf("array, change last item: %d\n", arrayFromlast);
        System.out.printf("linked, change last item: %d\n", linkedFromLast);
    }

    static long timerFromHead(List<Integer> list, long iteration) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) list.add(0, i);
        long end = System.currentTimeMillis();
        return end - start;
    }

    static long timerFromLast(List<Integer> list, long iteration) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) list.add(i);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static ArrayList<Integer> createArrayList(Integer[] data) {
        return new ArrayList<>(List.of(data));
    }

    private static LinkedList<Integer> createLinkedList(Integer[] data) {
        return new LinkedList<>(List.of(data));
    }
}
