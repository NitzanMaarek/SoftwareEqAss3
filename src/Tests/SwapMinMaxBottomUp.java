import Stubs.MinValueIndexMaxValueCopyArrStub;
import Stubs.Program;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapMinMaxBottomUp {

    @Test
    public void swapMinMaxTest(){
        Program program = new Program();
        int[] arr = {1, 3, 5};
        int[] expected = {5, 3, 1};
        assertArrayEquals(expected, program.swapMinMax(arr));
    }

    @Test
    public void testEmptyArray() {
        Program program = new Program();
        int[] arr1 = {};
        int[] actualArray = program.swapMinMax(arr1);
        int[] expectedMerge = {};
        assertArrayEquals(expectedMerge, actualArray);
    }

}
