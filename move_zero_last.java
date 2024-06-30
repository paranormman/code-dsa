package DSA;

/*Algorithm to move all the zeros to the last of an array without changing the order of the elements */

public class move_zero_last {
    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void moveZeros(int[] arr){
        int j = 0;                              // pointer 1 focus on zero elements
        for(int i = 0; i < arr.length; i++){    // pointer 2 focus on non zero elements
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={8, 1, 0, 2, 1, 0, 3};
        move_zero_last mz = new move_zero_last();
        mz.printArray(arr);
        mz.moveZeros(arr);
        mz.printArray(arr);
        
    }
}
