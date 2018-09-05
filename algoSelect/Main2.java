public class Main2 {

  public static void main(String[] args) {
    
    // Specific Condition Array - Random Array
    System.out.println("\n\nInput: Random Array");
    RandomArray testRan = new RandomArray();
    testRan.array = new int[10000];
    testRan.array = testRan.genRanInt(1000, 0, 9999);
    // testRan.printArray(testRan.array);

    // Specific Condition Array - Reversed
    // System.out.println("\nInput: Reversed Array\n");
    RandomArray testRev = new RandomArray();
    testRev.array = new int[100000];
    testRev.array = testRev.genRevInt(100000, 5000);
    // testRev.printArray(testRev.array);

    // Specific Condition Array - Minimal Unique
    // System.out.println("\nInput: Minimal Unique Array\n");
    RandomArray testUni = new RandomArray();
    testUni.array = new int[1000000];
    testUni.array = testUni.genRanInt(100000, 0, 1000000); //Unique by change parameters
    // testUni.printArray(testUni.array);

    // Specific Condition Array - Near Sorted
    // System.out.println("\nInput: Near Sorted Array\n");
    RandomArray testSor = new RandomArray();
    testSor.array = new int[1000000];
    testSor.array = testSor.genNearSortInt(100000, 0);
    // testSor.printArray(testSor.array);

    ArrayTest tester = new ArrayTest(testSor.array, "Integer", "Random");

    System.out.println("\nSize: " + tester.size);
    System.out.println("Range: " + tester.range);
    System.out.println("Unique: " + tester.unique);
    System.out.println("\n");

    tester.runTest(testSor.array);
    
  }
}