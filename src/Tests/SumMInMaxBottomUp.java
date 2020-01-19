
import Stubs.Program;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumMInMaxBottomUp {
    @Test
    public void sumMinMaxTest(){
        Program program = new Program();
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(6, program.sumMinMax(arr));
    }

}
