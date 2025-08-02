// To find the first non-repeating element in the array 
// using Two pointer 
public class nonRepeatingElement {

  public static void main(String[] args) {
    int arr[] = {9,4,9,6,7,4};
    System.out.println("The First non repeating element is :" +firstNonRepeating(arr));

  }
  static int firstNonRepeating(int arr[]){
    //Loop for checking each element 
    for(int i = 0; i<arr.length ;i++){
      //Checking if ith element is not present in array
      int j;
      for( j= 0;j<arr.length;j++){
        if (i != j && arr[i] == arr[j]) {
            break;     
        }
      }
        if( j == arr.length){
          return arr[i];
      }
      
    }
    return -1;
  }
}