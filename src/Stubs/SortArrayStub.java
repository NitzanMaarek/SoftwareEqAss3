package Stubs;

import java.util.Arrays;

public class SortArrayStub {

    public SortArrayStub(){}

    /**
     * method replaces the real sortArray method.
     * @param arr - expected array.
     * @return
     */
    public int[] sortArrayTopDownPhase1(int[] arr){
        int[] arr1 = {5, 3, 1};
        int[] arr2 = {6, 4, 2};
        int[] arr3 = {5, 3, 1, 6, 4, 2};
        if (Arrays.equals(arr, arr1)){
            return new int[]{1, 3, 5};
        }
        else if(Arrays.equals(arr, arr2)){
            return new int[]{2, 4, 6};
        }
        else if(Arrays.equals(arr, arr3)){
            return new int[]{1, 2, 3, 4, 5, 6};
        }
        return arr;
    }


}
