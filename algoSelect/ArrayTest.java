import java.io.*;
import java.util.*;
public class ArrayTest {

  double timerStart, timerEnd, timeTakenMillis;
  int size;
  int range;
  int unique;
  // String structDataType;
  // String initialCondition; // state of data
  // boolean stableReq;
  // boolean parallelReq;
  // boolean spaceReq;


  public ArrayTest(int[] input, String type, String condition) {
    // construct
    this.size = setSize(input);
    this.range = setRange(input);
    this.unique = setUnique(input);
  }

  public void runTest(int[] input) {
    // Test array with insertion sort, count sort, quick sort

    int[] data1 = input.clone();
    // int[] data2 = input.clone();
    int[] data3 = input.clone();
    int[] data4 = input.clone();
    int[] data5 = input.clone();
    int[] data6 = input.clone();


    // ------------ BETTER JACOB SORT ------------------ //
    timerStart = System.currentTimeMillis();
    // execute sort algorithm
    InsertionSort sort1 = new InsertionSort();
    // sort1.print("Input", data1);
    int[] output1 = sort1.sort(data1);
    // sort1.print("Output", output1);
    timerEnd = System.currentTimeMillis();
    timeTakenMillis = timerEnd - timerStart;
    System.out.println("Insertion Sort1 Function takes " + timeTakenMillis + " ms");
    System.out.println("Insertion Sort1 Function takes " + (timeTakenMillis/1000) + " seconds\n");



    /*
    // ------------ GEEK SORT ----------------- //
    timerStart = System.currentTimeMillis();
    // execute sort algorithm
    InsertionSort2 sort2 = new InsertionSort2();
    // sort1.print("Input", data2);
    int[] output2 = sort2.sort(data2);
    // sort1.print("Output", output2);
    timerEnd = System.currentTimeMillis();
    timeTakenMillis = timerEnd - timerStart;
    System.out.println("Insertion Sort2 Function takes " + timeTakenMillis + " ms");
    System.out.println("Insertion Sort2 Function takes " + (timeTakenMillis/1000) + " seconds\n");
    */



    // -------------- BINARY SEARCH SORT --------- //
    timerStart = System.currentTimeMillis();
    // execute sort algorithm
    BinaryInsertionSort sort3 = new BinaryInsertionSort();
    // sort3.print("Input", data3);
    int[] output3 = sort3.sort(data3);
    // sort3.print("Output", output3);
    timerEnd = System.currentTimeMillis();
    timeTakenMillis = timerEnd - timerStart;
    System.out.println("Binary Insertion Sort3 Function takes " + timeTakenMillis + " ms");
    System.out.println("Binary Insertion Sort3 Function takes " + (timeTakenMillis/1000) + " seconds\n");



    // -------------- COUNTING SORT --------- //
    timerStart = System.currentTimeMillis();
    // execute sort algorithm
    CountSort sort4 = new CountSort();
    // sort4.print("Input", data4);
    int[] output4 = sort4.sort(data4);
    // sort4.print("Output", output4);
    timerEnd = System.currentTimeMillis();
    timeTakenMillis = timerEnd - timerStart;
    System.out.println("Counting Sort4 Function takes " + timeTakenMillis + " ms");
    System.out.println("Counting Sort4 Function takes " + (timeTakenMillis/1000) + " seconds\n");


    // -------------- RADIX SORT --------- //
    timerStart = System.currentTimeMillis();
    // execute sort algorithm
    RadixSort sort5 = new RadixSort();
    // sort5.print("Input", data5);
    int n = data5.length;
    int[] output5 = sort5.sort(data5, n);
    // sort5.print("Output", output5);
    timerEnd = System.currentTimeMillis();
    timeTakenMillis = timerEnd - timerStart;
    System.out.println("Radix Sort5 Function takes " + timeTakenMillis + " ms");
    System.out.println("Radix Sort5 Function takes " + (timeTakenMillis/1000) + " seconds\n");

    // -------------- QUICK SORT --------- //
    timerStart = System.currentTimeMillis();
    // execute sort algorithm
    // sort6.print("Input", data6);
    Arrays.sort(data6);
    // sort6.print("Output", output6);
    timerEnd = System.currentTimeMillis();
    timeTakenMillis = timerEnd - timerStart;
    System.out.println("Quick Sort6 Function takes " + timeTakenMillis + " ms");
    System.out.println("Quick Sort6 Function takes " + (timeTakenMillis/1000) + " seconds\n");

  }

  public int setSize(int[] array) { return array.length; }
  public int setRange(int[] array) {
    int highest = 0;
    int lowest = 0;
    for(int i = 0; i< array.length; i++) {
      //
      if(highest < array[i]) {highest = array[i];}
      if(lowest > array[i]) {lowest = array[i];}
    }
    return (highest - lowest);
  }
  public int setUnique(int[] array) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // still needs work
    for(int i = 0; i < array.length; i++) {
      if(!map.containsKey(array[i])) {
        map.put(array[i], 1);
      }
    }
    return map.size();
  }
  public void testResults() {
    System.out.println("These are the results");
  }

}