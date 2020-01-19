import Stubs.CopyArrSizeStub;
import Stubs.Program;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SortArrayBottomUp {

    @Test
    public void sortArrayTest(){
        Program program = new Program();
        int[] arr1 = {5, 3, 1};
        int[] expected = {1, 3, 5};

        assertArrayEquals(expected, program.sortArray(arr1));
    }


    @Test
    public void sortArrayTestNullArray(){
        Program program = new Program();
        int[] arr1 = null;
        int[] expected = null;

        assertArrayEquals(expected, program.sortArray(arr1));
    }

}
