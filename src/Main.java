import collection.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Tashkent");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Bishkek");
        myArrayList.add("Samarkand");
        myArrayList.add(myArrayList.size(), "Tashkent");
        myArrayList.add(1, "Fergana");

        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);
        myArrayList.remove(0);

        myArrayList.trimToSize();

        System.out.println("Size after manipulations: " + myArrayList.size());
        System.out.println();
    }
}