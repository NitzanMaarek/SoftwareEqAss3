package Stubs;

import java.util.Arrays;

public class SortArrayStub extends Program {

    public SortArrayStub(){}

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
