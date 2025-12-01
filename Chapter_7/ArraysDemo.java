public class ArraysDemo {

    public static void display(String message, int[] array) {
        System.out.print(message + ": ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] myArray = new int[5];

        display("Original array", myArray);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 8;
        }
        display("After filling with 8s", myArray);

        myArray[2] = 6;
        myArray[4] = 3;
        
        display("After changing two values", myArray);

        java.util.Arrays.sort(myArray);
        
        display("After sorting", myArray);
        
        System.out.println("\n-----jGRASP: Operation complete.");
    }
}
