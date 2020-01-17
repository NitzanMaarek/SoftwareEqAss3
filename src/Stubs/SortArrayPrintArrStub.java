package Stubs;

public class SortArrayPrintArrStub extends SortArrayStub{

    // MAYBE EXTEND ONLY PROGRAM FOR SIMPLICITY?
    // HOWEVER THIS SOLVES DUPLICATE CODE.

    public SortArrayPrintArrStub(){}

    @Override
    public void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
