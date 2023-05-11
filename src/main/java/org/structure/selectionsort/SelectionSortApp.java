package org.structure.selectionsort;

public class SelectionSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        SelectionSort arr;
        arr = new SelectionSort(maxSize);

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


        arr.selectSort();
        arr.display();
    }
}
