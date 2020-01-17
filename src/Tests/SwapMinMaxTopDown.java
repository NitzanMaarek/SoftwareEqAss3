import Stubs.MinValueIndexMaxValueCopyArrStub;
import org.junit.Test;
import static org.junit.Assert.*;


public class SwapMinMaxTopDown {

    @Test
    public void swapMinMaxTest(){
        MinValueIndexMaxValueCopyArrStub minValueIndexMaxValueCopyArrStub = new MinValueIndexMaxValueCopyArrStub();
        int[] arr = {1, 3, 5};
        int[] expected = {5, 3, 1};
        assertArrayEquals(expected, minValueIndexMaxValueCopyArrStub.swapMinMax(arr));
    }
}
