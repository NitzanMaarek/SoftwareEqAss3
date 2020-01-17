package Stubs;

public class MaxValueIndexStub extends Program{

    public MaxValueIndexStub(){}

    @Override
    public int maxValueIndex(int[] arr){
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
