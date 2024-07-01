package removeeveninteger;

public class RemoveEvenInteger {

    // print array method
    public static void printArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    // removeEven method
    public static int[] removeEven(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5}; // 3, 7, 5
        printArray(arr);
        int[] result = removeEven(arr);
        printArray(result);
        
    }
    
}
