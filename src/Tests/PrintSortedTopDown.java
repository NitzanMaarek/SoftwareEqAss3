import Stubs.SortArrayPrintArrStub;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PrintSortedTopDown {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void printSortedTest() {
        SortArrayPrintArrStub sortArrayPrintArrStub = new SortArrayPrintArrStub();
        int[] arr = {5, 3, 1};
        sortArrayPrintArrStub.printSorted(arr);
        assertEquals("5 3 1 \r\n1 3 5 \r\n1 3 5 \r\n", outContent.toString());
    }

    @Test
    public void printSortedTestNullArray() {
        SortArrayPrintArrStub sortArrayPrintArrStub = new SortArrayPrintArrStub();
        int[] arr = null;
        sortArrayPrintArrStub.printSorted(arr);
        assertEquals("No Array \r\n", outContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
