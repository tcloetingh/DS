package org.structure.bubblesort;


public class BubbleSortApp {
    public static void main(String[] args) {

        int maxSize = 100;
        BubbleSort arr;

        arr = new BubbleSort(maxSize);

        arr.insert(34);
        arr.insert(55);
        arr.insert(12);
        arr.insert(99);
        arr.insert(43);
        arr.insert(21);
        arr.insert(77);
        arr.insert(40);
        arr.insert(53);
        arr.insert(68);

        //arr.display();
        //arr.bubbleSort();
        arr.bubbleSort();
        arr.display();

    }
}
