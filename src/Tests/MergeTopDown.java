import Stubs.SortArrayStub;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeTopDown {

    @Test
    public void mergeTest(){
        SortArrayStub programStub = new SortArrayStub();
        int[] arr1 = {5, 3, 1};
        int[] arr2 = {6, 4, 2};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, programStub.merge(arr1, arr2));
    }

    @Test
    public void mergeTestNullArray1(){
        SortArrayStub programStub = new SortArrayStub();
        int[] arr1 = null;
        int[] arr2 = {6, 4, 2};
        int[] expected = { 2, 4, 6};
        assertArrayEquals(expected, programStub.merge(arr1, arr2));
    }


    @Test
    public void mergeTestNullArray2(){
        SortArrayStub programStub = new SortArrayStub();
        int[] arr1 = {5, 3, 1};
        int[] arr2 = null;
        int[] expected = { 1, 3, 5};
        assertArrayEquals(expected, programStub.merge(arr1, arr2));
    }

    @Test
    public void testEmptyArray_1() {
        SortArrayStub programStub = new SortArrayStub();
        int[] arr1 = new int[0];
        int[] arr2 = {5, -7, 2};
        int[] actualMerge = programStub.merge(arr1, arr2);
        int[] expectedMerge = {-7, 2, 5};
        assertArrayEquals(expectedMerge, actualMerge);
    }

    @Test
    public void testEmptyArray_2() {
        SortArrayStub programStub = new SortArrayStub();
        int[] arr1 = {5, -7, 2};
        int[] arr2 = new int[0];
        int[] actualMerge = programStub.merge(arr1, arr2);
        int[] expectedMerge = {-7, 2, 5};
        assertArrayEquals(expectedMerge, actualMerge);
    }







//    private SortArrayStub sortArrayStub;
//    private SortArrayTopDown sortArrayTopDown;

//    public MergeTopDown(){
//        sortArrayStub = new SortArrayStub();
//        sortArrayTopDown = new SortArrayTopDown();
//    }

//    /**
//     * Instead of using sortArray, we use sortArrayStub.sortArray().
//     * @param ar1
//     * @param ar2
//     * @return
//     */
////
////    public int[] mergePhase1(int[] ar1, int[] ar2) {
////        if (ar1==null && ar2==null) return null;
////        if (ar1==null) return sortArrayStub.sortArrayTopDownPhase1(ar2);
////        if (ar2==null) return sortArrayStub.sortArrayTopDownPhase1(ar1);
////        int[] res = merge(ar1, ar2);
////        return sortArrayStub.sortArrayTopDownPhase1(res);
////
////    }
////
////    private int[] merge(int[] ar1, int[] ar2){
////        int[] res = new int[ar1.length+ar2.length];
////        int i = 0;
////        for(int j=0; j<ar1.length; j++)
////            res[i++] = ar1[j];
////        for(int j=0; j<ar2.length; j++)
////            res[i++] = ar2[j];
////        return res;
////    }
//    @Test
//    public void mergePhase1Test(){
//        MergeTopDown mergeTopDown = new MergeTopDown();
//        int[] arr1 = {5, 3, 1};
//        int[] arr2 = {6, 4, 2};
//        int[] expected1 = {1, 2, 3, 4, 5, 6};
//        int[] result = mergeTopDown.mergePhase1(arr1, arr2);
//        assertArrayEquals(expected1, result);
//
//        int[] expected2 = {1, 3, 5};
//        result = mergeTopDown.mergePhase1(arr1, new int[]{});
//        assertArrayEquals(expected2, result);
//
//        result = mergeTopDown.mergePhase1(new int[]{}, arr1);
//        assertArrayEquals(expected2, result);
//    }

}
