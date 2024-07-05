package reversearray;

public class ReverseArray {

    public static void printArray(String message, int[] array) {
        System.out.println(message + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 12, 7, 6, 5};
        printArray("The original array", nums);
        reverseArray(nums, 0, nums.length - 1);
        printArray("The reversed array", nums);
    }

}
