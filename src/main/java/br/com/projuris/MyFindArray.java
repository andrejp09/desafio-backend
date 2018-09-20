package br.com.projuris;

public class MyFindArray implements FindArray {

    @Override
    public int findArray(int[] array, int[] subArray) {
        int MAX_POSITION_ARRAY_1 = array.length - 1;
        int MAX_POSITION_ARRAY_2 = subArray.length - 1;


        for (int i = MAX_POSITION_ARRAY_1; i >= 0; i--) {

            boolean contains = true;
            for (int j = 0; j < subArray.length && j <= i; j++) {
                if (array[i - j] != subArray[MAX_POSITION_ARRAY_2 - j]) {
                    contains = false;
                    break;
                }
            }
            if (contains) {
                return i - MAX_POSITION_ARRAY_2;
            }
        }

        return -1;
    }

}