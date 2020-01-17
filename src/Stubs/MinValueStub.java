package Stubs;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

public class MinValueStub {

    public MinValueStub(){}

    public int minValueTopDownPhase1(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
