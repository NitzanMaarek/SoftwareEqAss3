package Program;

import Stubs.PrintArrStub;
import Stubs.SortArrayStub;

public class PrintSortedTopDown {

    private SortArrayStub sortArrayStub;
    private PrintArrStub printArray;

    public PrintSortedTopDown(){
        sortArrayStub = new SortArrayStub();
        printArray = new PrintArrStub();
    }

    public void printSortedPhase1(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        printArray.printArrTopDownPhase1(arr);
        arr = sortArrayStub.sortArrayTopDownPhase1(arr);
        printArray.printArrTopDownPhase1(sortArrayStub.sortArrayTopDownPhase1(arr));
        printArray.printArrTopDownPhase1(arr);
    }
}
