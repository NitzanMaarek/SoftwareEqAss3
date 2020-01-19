import Stubs.Program;
import Stubs.SortArrayEqualArraysStub;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSortedBottomUp {


    @Test
    public void isSortedTest(){
        Program programStub =  new Program();
        int[] arr1 = {5, 3, 1};
        assertFalse(programStub.isSorted(arr1));
    }

    @Test
    public void isSorted2Test(){
        Program programStub =  new Program();
        int[] arr1 = {-4, 3, 10};
        assertTrue(programStub.isSorted(arr1));
    }

    @Test
    public void isSortedNullArrayTest(){
        Program programStub =  new Program();
        int[] arr =  null;
        assertTrue(programStub.isSorted(arr));
    }

}
