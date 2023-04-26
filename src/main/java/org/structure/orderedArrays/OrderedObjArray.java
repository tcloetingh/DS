package org.structure.orderedArrays;

public class OrderedObjArray {
    private PersonObj[] arr;
    private int numElems;

    public OrderedObjArray(int maxEls) {
        this.arr = new PersonObj[maxEls];
        numElems = 0;
    }

    public int size() {
        return this.numElems;
    }

    public PersonObj find(String searchName) {
        int j;
        for (j = 0; j < numElems; j++) {
            if (arr[j].getLastName().equals(searchName)) {
                break;
            }
        }
        if (j == numElems) {
            return null;
        } else {
            return arr[j];

        }
    }


    public void insert(String first, String last, int age) {
        arr[numElems] = new PersonObj(first, last, age);
        numElems++;
    }

    public boolean delete(String value) {
        int j;

        for(j=0; j<numElems; j++) {
            if(arr[j].getLastName().equals(value)) {
                break;
            }
        }
        if(j==numElems) {
            return false;
            //cant find it
        } else {
            for (int k = j; k < numElems; k++) {
                arr[k] = arr[k + 1];
            }
            numElems++;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < numElems; i++) {
            arr[i].displayPerson();
        }
    }
}
