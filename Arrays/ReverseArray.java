import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int arr[] = {4, 9, 2, 6, 3};
    findReverseArray(arr); // reverse in-place

    System.out.println("Reversed Array is: " + Arrays.toString(arr));
  }

  static void findReverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
  }
}
