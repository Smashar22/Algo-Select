public class CountSort {

  // If you a have much data to sort (e.g. defragging), which can cunsume more ram than you have aviable, you would use mergesort, because you dont need to have all the data in your ram to sort it.

  // Useful for when the range numbers can be is very small
  // Counting sort is most suitable for such cases, when k is a 'small range'. It has linear (O(n+k)) complexity.

  // Counting sort is Stable, so it maintains the original order of numbers
  public static void main(String[] args) {

    System.out.println("\nInput");
    int[] input = {4, 9, 24, 32, 21, 45, 84, 93, 4, 5, 32, 92};
    for(int i=0; i<input.length; i++) {
      System.out.print(", " + input[i]);
    }
    System.out.println();

    CountSort cs = new CountSort();

    int[] output = cs.sort(input);
    

    System.out.println("\nOutput");
    for(int i=0; i<output.length; i++) {
      System.out.print(", " + output[i]);
    }
    System.out.println("\n");
    
  }

  public int[] sort(int[] input) {

    // Count Sort
    // int range_min = smallest(input);
    // int range_max = largest(input);
    // int range = range_max-range_min;
    //
    // Range is useful for calculating the BigO 
    int len = input.length;
    int[] output = new int[input.length];
    // ----------------------------------------- //

    // Step 1 - count occurences of number in array, to create an occurences array
    int[] occurences = new int[largest(input) + 1]; // size is the range of input+1
                                                    // so we use the indexs to count
    for(int i=0; i < input.length; i++) {
      ++occurences[(input[i])]; //acquired occurences
    }
    // ----------------------------------------- //

    // Step 2 - make occurences array cumulative along the array
    for(int i=0; i< occurences.length; i++) {
      if(i != 0) {
        occurences[i] += occurences[i-1];
      }
    }
    // ------------------------------------------- //

    // Step 3 - shift the numbers once to the right in occurences array.
    //        - now the occurences array lists the indexs of the numbers in the
    //        - sorted output array
    for(int i=(occurences.length-1); i >= 0; i--) {
      if(i != 0) {
        occurences[i] = occurences[i-1];
      }
    }
    occurences[0] = 0;
    // ----------------------------------------- //

    // Step 4 - Place the values from input into the correct places in output

    for(int i=0; i< output.length; i++) {
      output[occurences[input[i]]] = input[i];
      occurences[input[i]] = occurences[input[i]] + 1; //increment so duplicate numbers are
    }                                                   // placed to the right of the first value

    return output;
  }


  public int smallest(int[] arr) {
    int smallest = arr[0];
    for(int i = 0; i < arr.length; i++) {
      smallest = arr[i] < smallest ? arr[i] : smallest;
    }
    return smallest;
  }
  
  public int largest(int[] arr) {
    int largest = arr[0];
    for(int i = 0; i < arr.length; i++) {
      largest = arr[i] > largest ? arr[i] : largest;
    }
    return largest;
  }
}
