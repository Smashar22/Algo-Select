
// Insertion Sort with shift optimisation.

// Instead of swapping, "shift" the values down the array
static void inssortshift(int[] A) {
  for (int i=1; i<A.length; i++) { // Insert i'th record
    int j;
    int temp = A[i];
    for (j=i; (j>0) && (temp < A[j-1]); j--)
      A[j] = A[j-1];
    A[j] = temp;
  }
}


