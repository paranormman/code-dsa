package DSA;

/* Algo to reverse an array */

public class reverse_array {

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] number){
        int start = 0;
        int end = number.length - 1;
        while(start < end){
            int tmp = number[start];
            number[start] = number[end];
            number[end] = tmp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] number = {2, 11, 5, 10, 7, 8};
        printArray(number);
        reverseArray(number);
        printArray(number);
        
    }   
}
