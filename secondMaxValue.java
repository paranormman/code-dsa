package DSA;
/* Algo to find the second maximum number in an array */

public class secondMaxValue {

    public int findsecondMax(int[] arr){
        int max = Integer.MIN_VALUE; 
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max);{
                secondMax = arr[i];
            }
        }
        return secondMax;
        
    }


    public static void main(String[] args) {
        int[] arr = {10, 24, 2, 35, 33, 2};
        // int[] arr = {13, 34, 2, 34, 33, 1};
        // int[] arr = {13, 34};
        

        secondMaxValue sm = new secondMaxValue();
        System.out.println(sm.findsecondMax(arr));

    }
}
