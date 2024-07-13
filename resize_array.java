package DSA;

public class resize_array {
    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] arrayResize(int[] arr, int capacity){
        int[] tmp = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            tmp[i] = arr[i];
        }
        // arr = tmp;
        return tmp;
    }

    public static void main(String[] args) {
        resize_array rs = new resize_array();
        int[] arr = new int[] {10, 20, 30, 40, 50};
        System.out.println("Size of the array is " + arr.length);
        arr = rs.arrayResize(arr, 10);
        System.out.println("Size of an array after resizing is " + arr.length);

    }
}
