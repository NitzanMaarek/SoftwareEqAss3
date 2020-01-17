package Program;

import Stubs.MaxValueStub;
import Stubs.MinValueStub;

public class SumMinMaxTopDown {

    private MaxValueStub maxValueStub;
    private MinValueStub minValueStub;

    public SumMinMaxTopDown(){
        maxValueStub = new MaxValueStub();
        minValueStub = new MinValueStub();
    }

    public int sumMinMaxPhase1(int[] arr) {
        return minValueStub.minValueTopDownPhase1(arr) + maxValueStub.maxValueTopDownPhase1(arr);
    }


}
