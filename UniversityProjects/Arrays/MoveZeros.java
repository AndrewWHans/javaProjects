package movezeros;

public class MoveZeros {

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] arr = {3, 12, 0, 8, 1, 0, 7};
        System.out.println("Here is the original array:");
        printArray(arr);
        moveZero(arr, arr.length);
        System.out.println("Here is the moved zero array:");
        printArray(arr);
    }
    
    public void moveZero(int[] arr, int n) {
        int j = 0; // pointer for zero
        for (int i = 0; i < n; i++) { // traverse array, i focus non-zero E
            if (arr[i] != 0 && arr[j] == 0) {
                // swapping using temp variable
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }
    
    public static void main(String[] args) {
        MoveZeros arrUtil = new MoveZeros();
        arrUtil.arrayDemo();
        
    }
    
}
