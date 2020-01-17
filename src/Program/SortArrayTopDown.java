package Program;

import Stubs.CopyArrStub;

public class SortArrayTopDown {

    private CopyArrStub copyArrStub;

    public SortArrayTopDown(){
        copyArrStub = new CopyArrStub();
    }

    public int[] sortArrayPhase2(int[] arr) {
        if (arr == null) return null;
        int[] res = copyArrStub.copyArrTopDown2(arr);
        for(int i=0; i<arr.length; i++)
            for (int j=0; j<arr.length-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }
}
