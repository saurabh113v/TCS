import java.util.Arrays;

public class rearrangeIncAndDec {

  public static void main (String args[]){
      int arr[] = {9,2,6,3,7,8,5};
      int n = arr.length;
      Arrays.sort(arr);
      for(int i = 0; i< n/2 ;i++){
        System.out.println(arr[i] + " ");
      }
      for(int i= n-1; i>= n/2 ; i--){
        System.out.println(arr[i] + " ");
      }  
  }
}
