package Stubs;

import java.util.Arrays;

public class EqualArraysStub {

    public void EqualArraysStub(){}

    public boolean equalArraysTopDownPhase1(int[] arr1, int[] arr2) {
        if (arr1==null && arr2 == null) return true;
        return Arrays.equals(arr1, arr2);
    }
}
