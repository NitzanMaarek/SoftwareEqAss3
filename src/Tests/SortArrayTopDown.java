import Stubs.CopyArrSizeStub;
import org.junit.Test;
import static org.junit.Assert.*;


public class SortArrayTopDown {

    @Test
    public void sortArrayTest(){
        CopyArrSizeStub copyArrSizeStub = new CopyArrSizeStub();
        int[] arr1 = {5, 3, 1};
        int[] expected = {1, 3, 5};
        assertArrayEquals(expected, copyArrSizeStub.sortArray(arr1));
    }
}
