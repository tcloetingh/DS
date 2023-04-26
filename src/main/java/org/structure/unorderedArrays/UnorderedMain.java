package org.structure.unorderedArrays;

public class UnorderedMain {
    public static void main(String[] args) {
        int maxSize = 100;
        UnorderedArray arr;
        arr = new UnorderedArray(maxSize);

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

        arr.display();

        int searchKey = 36;

        if (arr.find(searchKey)) {
            System.out.println("found it " + searchKey);
        } else {
            System.out.println(" cant find " + searchKey);
        }

        arr.delete(56);

        arr.delete(55);

        arr.display();

    }
}
