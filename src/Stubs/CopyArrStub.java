package Stubs;

import java.util.Arrays;

public class CopyArrStub {

    public CopyArrStub(){

    }

    public int[] copyArrTopDownPhase2(int[] arr){
        int[] arr1 = {5,4,7,2,1};
        int[] arr2 = {2, 65, 87, 121, 6, 21};

        if (Arrays.equals(arr, arr1)){
            return new int[]{5,4,7,2,1};
        }
        else if(Arrays.equals(arr, arr2)){
            return new int[]{2, 65, 87, 121, 6, 21};
        }
        return arr;
    }
}
