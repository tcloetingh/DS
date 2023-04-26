package org.structure.orderedArrays;

public class OrderedArray {
    private long[] arr;
    private int numElems;

    public OrderedArray(int maxEls) {
        this.arr = new long[maxEls];
        numElems = 0;
    }

    public int size() {
        return this.numElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = numElems - 1;
        int currInt;

        while(true) {
            currInt = (lowerBound + upperBound) / 2;

            if (arr[currInt] == searchKey) {
                return currInt; // found it
            } else if (lowerBound > upperBound) {
                return numElems; // cannot find it, not in array
            } else {
                if(arr[currInt] < searchKey) {
                    // currInt is smaller than searchKey, look in the block of elements above currInt
                    lowerBound = currInt + 1;
                } else {
                    upperBound = currInt - 1;
                    // currInt is larger than searchKey so look below it
                }
            }
        }
    }


    public void insert(long value) {
        int j;
        for (j=0; j< numElems; j++) {
            if (arr[j] > value) {
                // size position found in the order, exit loop as the next element is larger than value

                break;
            }
        }
        for(int k=numElems; k > j; k--) {
            arr[k] = arr[k - 1];
            // k - 1 takes element and moves it up a spot from previous position
                }
        // all elements have been moved up a spot
        // fill in empty spot [j] with value
        arr[j] = value;
        // increment for next use (must be kept track of independently of array) no such arr.count used
        numElems++;
    }

    public boolean delete(long value) {
        int j = find(value);

        if (j == numElems) {
            return false;
        } else {
            for (int k = j; k < numElems; k++) {
                arr[k] = arr[k + 1];
            }
                numElems--;
                return true;
        }
    }

    public void display() {
        for (int i = 0; i < numElems; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
