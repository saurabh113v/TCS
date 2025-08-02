public class sumArray{
  public static void main(String args[]){
    int arr[] = {4,2,5,6,8};
    int n = arr.length;

    int sum = 0;
    for(int i = 0; i<n; i++){
      sum += arr[i];
   
    }
   System.out.println("Sum of Element " + sum);
  }
}