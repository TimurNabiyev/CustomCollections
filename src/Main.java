import collection.MyArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 30_000_000; i++) {
            myArrayList.add(i);
        }


        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 3_000; i++) {
            myArrayList.remove(0);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("MyArrayList time consumption: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 3_000; i++) {
            arrayList.remove(0);
        }
        endTime = System.currentTimeMillis();

        System.out.println("ArrayList time consumption: " + (endTime - startTime));
    }
}