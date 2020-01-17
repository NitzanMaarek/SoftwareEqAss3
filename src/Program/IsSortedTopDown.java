package Program;

import Stubs.EqualArraysStub;
import Stubs.SortArrayStub;

public class IsSortedTopDown {

    private SortArrayStub sortArrayStub;
    private EqualArraysStub equalArraysStub;

    public IsSortedTopDown(){
        sortArrayStub = new SortArrayStub();
        equalArraysStub = new EqualArraysStub();
    }

    public boolean isSortedPhase1(int[] arr) {
        int[] sorted = sortArrayStub.sortArrayTopDownPhase1(arr);
        return equalArraysStub.equalArraysTopDownPhase1(arr, sorted);
    }
}
