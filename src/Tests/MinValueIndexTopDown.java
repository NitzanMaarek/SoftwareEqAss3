import Stubs.Program;
import Stubs.SizeStub;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinValueIndexTopDown {

    @Test
    public void minValueIndexTest(){
        Program sizeStub = new SizeStub();
        int[] arr = {1, 3, 5};
        assertEquals(0, sizeStub.minValueIndex(arr));
    }
    @Test
    public void minValueIndexTestemptyArray(){
        Program sizeStub = new SizeStub();
        int[] arr = new int[0];
        assertEquals(-1, sizeStub.minValueIndex(arr));
    }
}
