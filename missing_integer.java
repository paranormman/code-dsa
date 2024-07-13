package DSA;

/* given an array of n-1 distinct numbers in range 1 to n. Find the missing number in the array
 * complexity should be O(N)
*/

public class missing_integer {

    public int findMissingInteger(int[] arr){
        int number = arr.length + 1;
        int total = number * (number + 1) / 2;

        // using foreach command
        for (int num : arr) {
            total = total - num;
        }
        // using normal for loop
        // for(int i = 0; i < arr.length; i++){
        //     total = total - arr[i];
        // }
        return total;
        }



    public static void main(String[] args) {
        missing_integer mi = new missing_integer();
        int[] arr = new int[] {1, 2, 4, 5, 6, 3, 9, 7};
        // mi.findMissingInteger(arr);
        System.out.println(mi.findMissingInteger(arr));
    }
}
