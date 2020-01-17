import Stubs.MaxValueIndexStub;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinValueTopDown {

    @Test
    public void minValueTest(){
        MaxValueIndexStub programStub = new MaxValueIndexStub();
        int[] arr = {1, 3, 5};
        assertEquals(1, programStub.minValue(arr));
    }
}
