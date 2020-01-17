package Stubs;

public class MinValueIndexMaxValueCopyArrStub extends Program {

    public MinValueIndexMaxValueCopyArrStub(){}

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

    @Override
    public int minValueIndex(int[] arr){
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    @Override
    public int[] copyArr(int[] arr){
        if(arr == null){
            return null;
        }
        int[] ans = new int[arr.length];
        System.arraycopy(arr, 0, ans, 0, arr.length);
        return ans;
    }
}
