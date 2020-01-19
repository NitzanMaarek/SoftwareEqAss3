import Stubs.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxValueIndexBottomUp {


    @Test
    public void maxValueIndexTest(){
        Program programStub = new Program();
        int[] arr = {1, 3, 5};
        assertEquals(2, programStub.maxValueIndex(arr));
    }

    @Test
    public void MaxValueIndexTestNullArray(){
        Program sizeStub = new Program();
        int[] arr = new int[0];
        assertEquals(-1, sizeStub.maxValueIndex(arr));
    }

}
