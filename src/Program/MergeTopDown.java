package Program;

import Stubs.SortArrayStub;

public class MergeTopDown {

    private SortArrayStub sortArrayStub;
    private SortArrayTopDown sortArrayTopDown;

    public MergeTopDown(){
        sortArrayStub = new SortArrayStub();
        sortArrayTopDown = new SortArrayTopDown();
    }

    /**
     * Instead of using sortArray, we use sortArrayStub.sortArray().
     * @param ar1
     * @param ar2
     * @return
     */

    public int[] mergePhase1(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return sortArrayStub.sortArrayTopDownPhase1(ar2);
        if (ar2==null) return sortArrayStub.sortArrayTopDownPhase1(ar1);
        int[] res = merge(ar1, ar2);
        return sortArrayStub.sortArrayTopDownPhase1(res);

    }
    private int[] merge(int[] ar1, int[] ar2){
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return res;
    }

    public int[] mergePhase2(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return sortArrayTopDown.sortArrayPhase2(ar2);
        if (ar2==null) return sortArrayTopDown.sortArrayPhase2(ar1);
        int[] res = merge(ar1, ar2);
        return sortArrayTopDown.sortArrayPhase2(res);

    }
}
