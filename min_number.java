package DSA;
/* Algo to find the min value in an array */

public class min_number {
    public int minNumber(int arr[]){
        //edge case
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input Exception");
        }
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1, 2};
        // int[] arr = {};
        min_number mn = new min_number();
        // int min = Integer.MIN_VALUE;
        // for (int i : arr) {
        //     if(i < min){
        //         min = i;
        //     }
        // }
        // System.out.println("min = " + min);

        System.out.println(mn.minNumber(arr));        
    }
}
