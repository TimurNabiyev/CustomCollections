import collection.MyArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        MyArrayList<String> myArrayListCopy = new MyArrayList<>();

        myArrayList.add("Tashkent");
        myArrayList.add("Bukhara");
        myArrayList.add("Khiva");
        myArrayList.add("Fergana");
        myArrayList.add("Samarkand");

        myArrayListCopy.add("Khiva");
        myArrayListCopy.add("Fergana");
        myArrayListCopy.add("Samarkand");

        System.out.println(myArrayListCopy.containsAll(myArrayList));
        System.out.println(myArrayList.addAll(myArrayListCopy));
        System.out.println(myArrayList.removeAll(myArrayListCopy));
    }
}