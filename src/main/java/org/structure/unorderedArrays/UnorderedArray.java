package org.structure.unorderedArrays;

public class UnorderedArray {
    private long [] a;
    private int nElems;

    public UnorderedArray(int max) {
        this.a = new long[max];
        this.nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for(j=0; j<nElems; j++) {
            if(a[j] == searchKey) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        } else {
            return true;
        }
    }


    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j<nElems; j++) {
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
                nElems --;
                System.out.println("deleted " + value);
                return true;
            }

    }

    public void display() {
        for(int j = 0; j<nElems; j++) {
            System.out.print(a[j]);
        }
    }


}
