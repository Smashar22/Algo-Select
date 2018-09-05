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
      int comp;
      int temp = arr[subj];
      for (comp=subj; (comp>0) && (temp < arr[comp-1]); comp--) {
        arr[comp] = arr[comp-1];
      }
      arr[comp] = temp;
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