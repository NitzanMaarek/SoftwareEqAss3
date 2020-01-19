
import Stubs.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxValueBottomUp {

    @Test
    public void maxValueTest(){
        Program programStub = new Program();
        int[] arr = {1, 3, 5};
        assertEquals(5, programStub.maxValue(arr));
    }

}
