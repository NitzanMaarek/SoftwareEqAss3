import Stubs.Program;
import org.junit.Test;
import static org.junit.Assert.*;

public class SizeBottomUp {

    @Test
    public void sizeTest(){
        Program program = new Program();
        int[] arr = {1, 3, 5};
        assertEquals(3, program.size(arr));
    }

    @Test
    public void sizeTestEmptyArray(){
        Program program = new Program();
        int[] arr = {};
        assertEquals(0, program.size(arr));
    }

}
