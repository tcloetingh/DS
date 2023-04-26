package org.structure.orderedArrays;

public class OrderedObjArrayMain {
    public static void main(String[] args) {
        int maxSize = 50;
        OrderedObjArray arr;

        arr = new OrderedObjArray(maxSize);

        arr.insert("Tyler", "Cloetingh", 32);
        arr.insert("Ginny", "Cunningham", 30);
        arr.insert("justin" , "stone", 32);
        arr.insert("Alex", "Hall", 31);
        arr.insert("Victor", "Bravo", 30);
        arr.insert("Hannah", "Fenton", 29);


        arr.display();

        System.out.println(arr.find("Cloetingh").getFirstName());


    }
}
