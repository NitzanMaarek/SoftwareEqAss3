import Stubs.Program;
import Stubs.SizeStub;
import com.sun.glass.ui.Size;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxValueIndexTopDown {

    @Test
    public void maxValueIndexTest(){
        SizeStub programStub = new SizeStub();
        int[] arr = {1, 3, 5};
        assertEquals(2, programStub.maxValueIndex(arr));
    }

    @Test
    public void MaxValueIndexTestNullArray(){
        Program sizeStub = new SizeStub();
        int[] arr = new int[0];
        assertEquals(-1, sizeStub.maxValueIndex(arr));
    }
}
