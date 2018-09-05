
// Insertion Sort with shift optimisation.

// Instead of swapping, "shift" the values down the array
static void inssortshift(int[] arr) {
  for (int i=1; i<arr.length; i++) { // Insert i'th record
    int j;
    int temp = arr[i];
    for (j=i; (j>0) && (temp < arr[j-1]); j--)
      arr[j] = arr[j-1];
    arr[j] = temp;
  }
}


