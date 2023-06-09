package org.structure.bubblesort;

public class BubbleSort {
    private int nElems;
    private long[] a;

    public BubbleSort(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void bubbleSort() {
        int outer;
        int inner;

        for(outer=nElems-1; outer > 1; outer--) {
            // if no outer it would only run 1 pass of bubbling
            // in theory could use a different mechanism to realize its all sorted
            // it will do needless passes once sorted to exhaust outer loop
            // every outer need only if the sort is completely backwards (every el out of order)
            System.out.println("Running a sort");
            for(inner=0; inner<outer; inner++){
                if (a[inner] > a[inner + 1]){
                        swap(inner, inner + 1);
                }
            }
        }
    }



    private void swap(int one, int two) {
        System.out.println("swapping " + a[one] + " and " + a[two]);
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }



    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == value) {
                break;
            }
        }
        if (j == nElems) {
            System.out.println(value + " not present in array");
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                // starting at where j was found increment and move elements down
                // ie k+1 takes next element and brings it down
                a[k] = a[k + 1];
            }
            nElems--;
            System.out.println("deleted " + value);
            return true;
        }

    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
    }
}