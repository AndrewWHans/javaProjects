package minarray;

public class MinArray {

    public int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input.");
        }
        
        int min = arr[0]; // min hold minimum of array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }   
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 4, 12};
        MinArray ma = new MinArray();
        ma.findMinimum(arr);
        System.out.println(ma.findMinimum(arr));
        
    }
}