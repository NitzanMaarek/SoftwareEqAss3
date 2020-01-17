import Stubs.CopyArrStub;
import org.junit.Test;
import static org.junit.Assert.*;


public class SortArrayTopDown {

    @Test
    public void sortArrayTest(){
        CopyArrStub copyArrStub = new CopyArrStub();
        int[] arr1 = {5, 3, 1};
        int[] expected = {1, 3, 5};
        assertArrayEquals(expected, copyArrStub.sortArray(arr1));
    }
}
