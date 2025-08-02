import java.util.Arrays;
public class findLargestElement{
  public static void main(String[] args) {
    int arr[] = {4,7,8,3,5};
    System.out.println("Largest Element " + sort(arr));
  }
  static int sort(int arr[]){
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
}