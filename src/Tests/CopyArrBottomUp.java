import Stubs.Program;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class CopyArrBottomUp {

    @Test
    public void copyArrTest(){
        Program programStub = new Program();
        int[] arr = {1, 3, 5};
        int[] result = programStub.copyArr(arr);
        assertArrayEquals(arr, result);
    }

    @Test
    public void copyEmptyArr(){
        Program programStub = new Program();
        int[] arr = {};
        int[] result = programStub.copyArr(arr);
        assertArrayEquals(arr, result);
    }

    @Test
    public void copyNullArr(){
        Program programStub = new Program();
        int[] arr = null;
        int[] result = programStub.copyArr(arr);
        assertNull(result);
    }

}
