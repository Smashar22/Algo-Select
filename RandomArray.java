import java.util.Random;
public class RandomArray {

  public int[] array;

  public int[] genRanInt(int size, int rangeMin, int rangeMax) {
    // Generate Random Integers
    int[] output = new int[size];
    Random random = new Random();
    output = random.ints(size, rangeMin, rangeMax).toArray();
    return output;
  }
  public double[] genRanDouble(int size, int rangeMin, int rangeMax) {
    // Generate Random Doubles
    double[] output = new double[size];
    Random random = new Random();
    output = random.doubles(size, rangeMin, rangeMax).toArray();
    return output;
  }

  public int[] genRevInt(int size, int rangeMax) {
    // Generate Reverse Order Integers
    int[] output = new int[size];
    for(int i = 0; i < size; i ++) {
      output[i] = (size - i) + rangeMax;
    }
    return output;
  }
  public double[] genRevDouble(int size, int rangeMax) {
    // Generate Reverse Order Doubles
    double[] output = new double[size];
    for(int i = 0; i < size; i ++) {
      output[i] = (size - i) + rangeMax;
    }
    return output;
  }

  public int[] genNearSortInt(int size, int rangeMax) {
    // Generate Near Sorted Integers
    int[] output = new int[size];
    for(int i = 0; i < size; i ++) {
      if(i > 2 && i < (size - 3)) {
        Random random = new Random();
        if (random.nextBoolean()) {
          output[i] = i + (random.nextInt() % 4);
        } else {
          output[i] = i - (random.nextInt() % 4);
        }
      }
    }
    return output;
  }
  public double[] genNearSortDouble(int size, int rangeMax) {
    // Generate Near Sorted Integers
    double[] output = new double[size];
    for(int i = 0; i < size; i ++) {
      if(i > 2 && i < (size - 3)) {
        Random random = new Random();
        if (random.nextBoolean()) {
          output[i] = i + (random.nextInt() % 4);
        } else {
          output[i] = i - (random.nextInt() % 4);
        }
      }
    }
    return output;
  }

  public void printArray(int arr[])
  {
    int n = arr.length;
    for (int i=0; i<n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println("\n");
  }
}


