import Stubs.SortArrayEqualArraysStub;
import org.junit.Test;
import static org.junit.Assert.*;


public class IsSortedTopDown {


    @Test
    public void isSortedTest(){
        SortArrayEqualArraysStub programStub =  new SortArrayEqualArraysStub();
        int[] arr1 = {5, 3, 1};
        assertFalse(programStub.isSorted(arr1));
    }

    @Test
    public void isSorted2Test(){
        SortArrayEqualArraysStub programStub =  new SortArrayEqualArraysStub();
        int[] arr1 = {-4, 3, 10};
        assertTrue(programStub.isSorted(arr1));
    }

    @Test
    public void isSortedNullArrayTest(){
        SortArrayEqualArraysStub programStub =  new SortArrayEqualArraysStub();
        int[] arr =  null;
        assertTrue(programStub.isSorted(arr));
    }

}
