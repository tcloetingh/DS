package org.structure.orderedArrays;

public class OrderedArrayMain {
    public static void main(String[] args) {
        int maxSize = 50;
        OrderedArray arr;

        arr = new OrderedArray(maxSize);

        arr.insert(5);
        arr.insert(8);
        arr.insert(18);
        arr.insert(39);
        arr.insert(48);
        arr.insert(23);
        arr.insert(14);
        arr.insert(11);
        arr.insert(41);
        arr.insert(28);

        arr.display();
        arr.size();

        System.out.println("size " + arr.size());
    }
}