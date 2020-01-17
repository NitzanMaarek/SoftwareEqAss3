package Stubs;

public class MinValueMaxValueStub extends Program{

    public MinValueMaxValueStub(){}

    @Override
    public int minValue(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }



}
