import java.util.Arrays;

public class secondSmallestAndSecondLargestElement{
  public static void main(String[] args) {
    int arr[] = {4, 9, 3, 7, 5, 1};

    System.out.println("Second Largest Element is: " + findSecondLargest(arr));
    System.out.println("Second Smallest Element is: " + findSecondSmallest(arr));
  }

  static int findSecondSmallest(int[] arr) {
    Arrays.sort(arr);
    return arr[1];  // Second element after sorting
  }

  static int findSecondLargest(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length - 2];  // Second last element after sorting
  }
}
