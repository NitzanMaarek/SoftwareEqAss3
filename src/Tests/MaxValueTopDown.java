import Stubs.MaxValueIndexStub;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxValueTopDown {

    @Test
    public void maxValueTest(){
        MaxValueIndexStub programStub = new MaxValueIndexStub();
        int[] arr = {1, 3, 5};
        assertEquals(5, programStub.maxValue(arr));
    }
}
