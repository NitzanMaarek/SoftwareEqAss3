import Stubs.Program;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualArraysBottomUp {


    @Test
    public void equalArraysTest(){
        Program programStub = new Program();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        assertFalse(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void notEqualArrayTest(){
        Program programStub = new Program();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {1, 4, 6};
        assertFalse(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void notSameSizeEqualArrayTest(){
        Program programStub = new Program();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6,8,9};
        assertFalse(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void equalNullArraysTest(){
        Program programStub = new Program();
        int[] arr1 = null;
        int[] arr2 = {2, 4, 6};
        assertFalse(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void equalNullArrays2Test(){
        Program programStub = new Program();
        int[] arr1 = {2, 4, 6};
        int[] arr2 = null;
        assertFalse(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void equalNullArrays3Test(){
        Program programStub = new Program();
        int[] arr1 = null;
        int[] arr2 = null;
        assertTrue(programStub.equalArrays(arr1, arr2));
    }

}
