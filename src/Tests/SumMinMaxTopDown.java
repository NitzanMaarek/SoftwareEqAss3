import Stubs.MinValueMaxValueStub;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumMinMaxTopDown {

    @Test
    public void sumMinMaxTest(){
        MinValueMaxValueStub minValueMaxValueStub = new MinValueMaxValueStub();
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(6, minValueMaxValueStub.sumMinMax(arr));
    }

}
