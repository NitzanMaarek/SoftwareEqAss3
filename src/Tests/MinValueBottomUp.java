
import Stubs.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinValueBottomUp {
    @Test
    public void minValueTest(){
        Program programStub = new Program();
        int[] arr = {1, 3, 5};
        assertEquals(1, programStub.minValue(arr));
    }

}
