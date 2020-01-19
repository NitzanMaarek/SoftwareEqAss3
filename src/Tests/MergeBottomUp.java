import Stubs.Program;
import Stubs.SortArrayStub;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeBottomUp {

    @Test
    public void mergeTest(){
        Program programStub = new Program();
        int[] arr1 = {5, 3, 1};
        int[] arr2 = {6, 4, 2};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, programStub.merge(arr1, arr2));
    }

    @Test
    public void mergeTestNullArray1(){
        Program programStub = new Program();
        int[] arr1 = null;
        int[] arr2 = {6, 4, 2};
        int[] expected = { 2, 4, 6};
        assertArrayEquals(expected, programStub.merge(arr1, arr2));
    }


    @Test
    public void mergeTestNullArray2(){
        Program programStub = new Program();
        int[] arr1 = {5, 3, 1};
        int[] arr2 = null;
        int[] expected = { 1, 3, 5};
        assertArrayEquals(expected, programStub.merge(arr1, arr2));
    }

    @Test
    public void testEmptyArray_1() {
        Program programStub = new Program();
        int[] arr1 = new int[0];
        int[] arr2 = {5, -7, 2};
        int[] actualMerge = programStub.merge(arr1, arr2);
        int[] expectedMerge = {-7, 2, 5};
        assertArrayEquals(expectedMerge, actualMerge);
    }

    @Test
    public void testEmptyArray_2() {
        Program programStub = new Program();
        int[] arr1 = {5, -7, 2};
        int[] arr2 = new int[0];
        int[] actualMerge = programStub.merge(arr1, arr2);
        int[] expectedMerge = {-7, 2, 5};
        assertArrayEquals(expectedMerge, actualMerge);
    }

}
