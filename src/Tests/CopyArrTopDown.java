import Stubs.SizeStub;
import org.junit.Test;
import static org.junit.Assert.*;

public class CopyArrTopDown {

    @Test
    public void copyArrTest(){
        SizeStub programStub = new SizeStub();
        int[] arr = {1, 3, 5};
        int[] result = programStub.copyArr(arr);
        assertArrayEquals(arr, result);
    }
}
