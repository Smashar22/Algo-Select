public class InsertionSort {

  public static void main(String[] args) {
    int[] input = {0, 29, 222, 3999, 12, 4, 8, 9, 12, 2, 5, 1};
    InsertionSort sort = new InsertionSort();
    sort.print("Input", input);
    int[] output = sort.sort(input);
    sort.print("Output", output);
  }


  public int[] sort(int[] arr) {
    // Happening: the sortening
    for(int subj=1; subj<arr.length; subj++) {
      for(int compare=0; compare<subj; compare++) {
        if(arr[subj] < arr[compare]) {
          int insert = arr[subj]; //save insert subj, right shift, insert subj
          rightShiftArray(arr, compare, subj);
          arr[compare] = insert;
        }
      }
    }
    return arr;
  }


  public int[] rightShiftArray(int[] arr, int startIndex, int endIndex) {
    // Happening: right shift
    for(int i = endIndex; i > startIndex; i--) {
      arr[i] = arr[i-1];
    }
    return arr;
  }


  public void print(String arrayName, int[] arr) {
    // Happening: print array
    System.out.print("\n" + arrayName + " = {");

    for(int i=0; i<arr.length; i++) {
      System.out.print( i<(arr.length-1) ? arr[i] + ", " : arr[i]);
    }
    System.out.println("}\n");
  }
}