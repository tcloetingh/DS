package org.structure.unorderedArrays;

public class ArrayApp {
    public static void main(String[] args) {
        long[] arr;
        arr = new long[100];
        int nElems = 10;
        int j;
        long searchkey;
        System.out.println("hello world");

        arr[0] = 34;
        arr[1] = 55;
        arr[2] = 12;
        arr[3] = 99;
        arr[4] = 43;
        arr[5] = 21;
        arr[6] = 77;
        arr[7] = 40;
        arr[8] = 53;
        arr[9] = 68;

        // --------- display ---------------------
        for (j = 0; j< nElems; j++) {
            System.out.println(arr[j]);
        }

        // ------ search: ex key 66 --------------
        searchkey = 68;

        for (j=0; j<nElems; j++) {
            if (arr[j] == searchkey) {
                break;
            }
        }

        if (j == nElems) {
            System.out.println("cant find " + searchkey);
        } else {
            System.out.println("found " + searchkey);
        }


        // ------ delete: ex 55
        searchkey = 55;

        for( j = 0; j<nElems; j++){
            if(arr[j] == searchkey) {
                System.out.println("deleting " + searchkey);
                break;
            }
        }
        for(int k = j; k<nElems - 1; k++){
            arr[k] = arr[k + 1];
        }
        nElems = nElems - 1;


        // --------- display again ---------------------
        for (j = 0; j< nElems; j++) {
            System.out.println(arr[j]);
        }

    }
}
