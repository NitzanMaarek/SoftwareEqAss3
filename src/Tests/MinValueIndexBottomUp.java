
import Stubs.Program;
import Stubs.SizeStub;
import org.junit.Test;
import static org.junit.Assert.*;

public class MinValueIndexBottomUp {

        @Test
        public void minValueIndexTest(){
            Program program = new Program();
            int[] arr = {1, 3, 5};
            assertEquals(0, program.minValueIndex(arr));
        }
        @Test
        public void minValueIndexTestemptyArray(){
            Program program = new Program();
            int[] arr = new int[0];
            assertEquals(-1, program.minValueIndex(arr));
        }
}
