
import Program.*;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopDownTests {

    /*
    Top-Down sequence of test execution by phases:
    1. swapMinMax, merge, isSorted, printSorted, sumMinMax.
    2. 1 + minValueIndex, minValue, maxValue, sortArray, printArr, equalsArrays.
    3. 2 + copyArr, maxValueIndex.
    4. size.

     */

    // *********** PHASE 1 ***********
    // Testing: swapMinMax, merge, isSorted, printSorted, sumMinMax.

    @Test
    public void mergePhase1Test(){
        MergeTopBottom mergeTopBottom = new MergeTopBottom();
        int[] arr1 = {5, 3, 1};
        int[] arr2 = {6, 4, 2};
        int[] expected1 = {1, 2, 3, 4, 5, 6};
        int[] result = mergeTopBottom.mergePhase1(arr1, arr2);
        assertArrayEquals(expected1, result);

        int[] expected2 = {1, 3, 5};
        result = mergeTopBottom.mergePhase1(arr1, new int[]{});
        assertArrayEquals(expected2, result);

        result = mergeTopBottom.mergePhase1(new int[]{}, arr1);
        assertArrayEquals(expected2, result);
    }

    @Test
    public void isSortedPhase1Test(){
        IsSortedTopDown isSortedTopDown = new IsSortedTopDown();
        int[] arr1 = {5, 3, 1};
        int[] arr2 = {1, 3, 5};

        assertFalse(isSortedTopDown.isSortedPhase1(arr1));
        assertTrue(isSortedTopDown.isSortedPhase1(arr2));
    }
}