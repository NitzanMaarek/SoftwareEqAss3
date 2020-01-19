import Stubs.SizeStub;
import org.junit.Test;
import static org.junit.Assert.*;

public class EqualArraysTopDown {

    @Test
    public void equalArraysTest(){
        SizeStub programStub = new SizeStub();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {1, 3, 5};
        assertTrue(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void notEqualArrayTest(){
        SizeStub programStub = new SizeStub();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {1, 4, 6};
        assertFalse(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void notSameSizeEqualArrayTest(){
        SizeStub programStub = new SizeStub();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6,8,9};
        assertFalse(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void equalNullArraysTest(){
        SizeStub programStub = new SizeStub();
        int[] arr1 = null;
        int[] arr2 = {2, 4, 6};
        assertFalse(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void equalNullArrays2Test(){
        SizeStub programStub = new SizeStub();
        int[] arr1 = {2, 4, 6};
        int[] arr2 = null;
        assertFalse(programStub.equalArrays(arr1, arr2));
    }

    @Test
    public void equalNullArrays3Test(){
        SizeStub programStub = new SizeStub();
        int[] arr1 = null;
        int[] arr2 = null;
        assertTrue(programStub.equalArrays(arr1, arr2));
    }
}
