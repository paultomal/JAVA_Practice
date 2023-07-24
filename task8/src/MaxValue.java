public class MaxValue {
    public double findMax(double[] arr){
        double max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public long findMax(long[] ar){
        long max = 0;
        for(int i=0; i<ar.length; i++){
            if(ar[i]>max){
                max = ar[i];
            }
        }
        return 0;
    }
    public int findMax(int... num){
        int max = num[0];
        for(int i : num)
        {
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
