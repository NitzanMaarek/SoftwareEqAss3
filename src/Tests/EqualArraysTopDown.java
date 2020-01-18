import Stubs.SizeStub;
import org.junit.Test;
import static org.junit.Assert.*;

public class EqualArraysTopDown {

    @Test
    public void equalArraysTest(){
        SizeStub programStub = new SizeStub();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        assertFalse(programStub.equalArrays(arr1, arr2));
    }
}
