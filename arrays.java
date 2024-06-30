package DSA;

/*Algorithm to declare and init an array and print the values */

public class arrays {

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 4;
        myArray[2] = 3;
        myArray[3] = 2;
        myArray[4] = 1;
        myArray[2] = 10;
        // myArray[5] = 100;
        printArray(myArray);

        int[] arr = {1,2,3,4};
        printArray(arr);

  
    }


    public static void main(String[] args) {
        arrays a = new arrays();
        a.arrayDemo();
        a.printArray(new int[] {10, 20 ,30, 40, 50});  // ca declare a new array inside the method that we are calling
        
    }
}
