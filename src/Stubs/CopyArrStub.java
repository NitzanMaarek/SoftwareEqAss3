package Stubs;

import java.util.Arrays;

public class CopyArrStub extends Program{

    public CopyArrStub(){}

    @Override
    public int[] copyArr(int[] arr){
        if(arr == null){
            return null;
        }
        int[] ans = new int[arr.length];
        System.arraycopy(arr, 0, ans, 0, arr.length);
        return ans;
    }

}
