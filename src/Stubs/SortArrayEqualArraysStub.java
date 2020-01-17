package Stubs;

import java.util.Arrays;

public class SortArrayEqualArraysStub extends Program {

    public SortArrayEqualArraysStub(){}

    @Override
    public boolean equalArrays(int[] arr1, int[] arr2) {
        if (arr1==null && arr2 == null) return true;
        return Arrays.equals(arr1, arr2);
    }

    @Override
    // Returns an ascending sorted copy of array "arr"
    public int[] sortArray(int[] arr) {
        if (arr == null) return null;
        int[] res = copyArray(arr);
        Arrays.sort(res);
        return res;
    }

    private int[] copyArray(int[] arr){
        if(arr == null){
            return null;
        }
        int[] ans = new int[arr.length];
        System.arraycopy(arr, 0, ans, 0, arr.length);
        return ans;
    }



}
