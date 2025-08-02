import java.util.Arrays;


public class findSmallestElement {
  public static void main(String[] args) {
    int arr[] = {5,2,4,8,0};
    System.out.println("The Smallest number is : "+ sort(arr));
  }
    static int sort(int arr[]){
      Arrays.sort(arr);
      return arr[0];
  
  }
}
