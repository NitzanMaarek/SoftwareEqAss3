import Stubs.Program;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinValueIndexTopDown {

    @Test
    public void minValueIndexTest(){
        Program program = new Program();
        int[] arr = {1, 3, 5};
        assertEquals(0, program.minValueIndex(arr));
    }
}
