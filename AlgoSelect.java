import java.util.*;
import java.lang.*;
import java.io.IOException;
// import java.lang.System;
import java.io.Console;


public class AlgoSelect {

  Object struct;
  String structID;
  String structDataType;
  String initialCondition; // state of data
  boolean stableReq;
  boolean parallelReq;
  boolean spaceReq;

  AlgoSelect(Object struct) {
    this.struct = struct;
    this.structID = identifyStruct(struct);
    System.out.println("\n\t\t - - Input Data Structure: " + this.structID + " - - ");
    this.stableReq = false;
    this.parallelReq = false;
    this.spaceReq = false;
  }


  public String identifyStruct(Object struct) {
    String typeID = "";

    if (struct instanceof int[]) {
        typeID = "Primitive int Array";
    } else if(struct instanceof ArrayList) {
        typeID = "Dynamic Integer Array";
    } else if(struct instanceof LinkedList) {
        typeID = "Linked List";
    } else if(struct instanceof HashMap) {
        typeID = "Hash Map";
    } else if(struct instanceof Hashtable) {
        typeID = "Hash table";
    } else if(struct instanceof TreeMap) {
        typeID = "Tree Map";
    } else if(struct instanceof Stack) {
        typeID = "Stack";
    } else {
      System.out.println("Custom Data Structure, otherwise, Unidentified");
    }
    return typeID;
  }
  public void assessStruct() {
    // Ask some questions of user

    Console c = System.console();
    if (c == null) {
        System.err.println("No console.");
        System.exit(1);
    }

    System.out.println("\nAnswer these 5 questions for the most efficient algorithm for " + this.structID+":");
    String input1 = c.readLine("\n1. The type of the data elements: object, byte, integer, double, float, string? ");
    setDataType(input1);

    String input2 = c.readLine("\n2. Is the data: Random | Nearly Sorted | Reversed | Few Unique ? ");
    setInitialCondition(input2);

    String input3 = c.readLine("\n3. Is Hard drive space a concern? ");
    if(input3.substring(0,1).equals("y") || input3.substring(0,1).equals("Y")) { 
      setSpaceReq(true); } else { 
      setSpaceReq(false); 
    }
    String input4 = c.readLine("\n4. Does the data need to be stable? (Default:YES) ");
    if(input4.substring(0,1).equals("y") || input4.substring(0,1).equals("Y")) { 
      setStableReq(true); } else { 
      setStableReq(false); 
    }
    String input5 = c.readLine("\n5. Are you sorting the data serially or in parallel? ");
    if(input5.substring(0,1).equals("p") || input5.substring(0,1).equals("P")) { 
      setParallel(true); } else { 
      setParallel(false);
    }
    // testStruct();
  }
  
  /*
  public void testStruct() {

    if (structID.equals("Primitive int Array")) {
      System.out.println("Begin tester");
      ArrayTest tester = new ArrayTest();
    } else if(structID.equals("Dynamic Integer Array")) {
      ArrayListTest tester = new ArrayListTest();    
    } else if(structID.equals("Linked List")) {
      LinkedListTest tester = new LinkedListTest();    
    } else if(structID.equals("Hash Map")) {
      HashMapTest tester = new HashMapTest();    
    } else if(structID.equals("Hash table")) {
      HashTableTest tester = new HashTableTest();    
    } else if(structID.equals("Tree Map")) {
      TreeMapTest tester = new TreeMapTest();    
    } else if(structID.equals("Stack")) {
      StackTest tester = new StackTest();    
    } else {
      System.out.println("Custom Data Structure, otherwise, Unidentified");
    }
    tester.runTests();
  }
  */

  public void getStructAdvice(Object o) {
    // Details all the scenarios wherein you would use a structure

    System.out.println("\n\nThis data structure is: " + nameOf(o));

    switch (nameOf(o)) {
      case "int[]":
        System.out.println("\n ---------------------");
        System.out.println("| Array/Vector Advice |");
        System.out.println(" ---------------------");

        System.out.println("\n - General Advice - ");
        System.out.println("Most of the time arrays are the fastest data structure.");
        System.out.println("Counting Sort, Merge Sort, and Radix Sort are the fastest");
        System.out.println("For simplicity and small data sets Insertion Sort is fine");

        System.out.println("\n - Use Cases - ");
        System.out.println("Many, everywhere.\n");

        break;
      case "ArrayList":

        System.out.println("\n ---------------------");
        System.out.println("| Dynamic Array Advice |");
        System.out.println(" ---------------------");
        
        System.out.println("\n - General Advice - ");
        System.out.println("\n - Use Cases - ");
        System.out.println("Something \n");
        break;
      case "LinkedList":

        System.out.println("\n ---------------------");
        System.out.println("| Linked List Advice |");
        System.out.println(" ---------------------");      
        System.out.println("\n - General Advice - ");
        System.out.println("To sort use Collections.sort()");
        System.out.println("\n - Use Cases - ");
        System.out.println("Something \n");
        break;
      case "HashMap":
        System.out.println("\n ---------------------");
        System.out.println("| Hash Map Advice |");
        System.out.println(" ---------------------"); 
        
        System.out.println(" - General Advice - ");
        System.out.println("Most details are the same as Hashtables, except hashtables are inherently synchronized" +
               "\n and hence are thread safe while the hash maps are not thread safe collection.");
        System.out.println(" - Use Cases - ");
        System.out.println("Something \n");
        break;
      case "Hashtable":

        System.out.println("\n ---------------------");
        System.out.println("| Hash Table Advice |");
        System.out.println(" ---------------------"); 

        System.out.println(" - General Advice - ");
        System.out.println("Hashtable are fast and eloquent. However, the data is unsorted");
        System.out.println("1) Everything in the hash table is part of a pair -- there is a key and a value. You put in and get out data by specifying the key you are operating on.\n" +
               "\n" +
               "2) If you are doing anything by a single key on a hash table, it is blazingly fast. This implies that put(key,value), get(key), contains(key), and remove(key) are all really fast.\n" +
               "\n" +
               "3) Generic hash tables fail at doing anything not listed in #2! (By \"fail\", we mean they are blazingly slow.)");
        System.out.println(" - Use Cases - ");
        System.out.println("We use hash tables when their magic fits our problem.\n" +
               "\n" +
               "For example, caching frequently ends up using a hash table -- for example, let's say we have 45,000 students in a university and some process needs to hold on to records for all of them. If you routinely refer to student by ID number, then a ID => student cache makes excellent sense. The operation you are optimizing for this cache is fast lookup.\n" +
               "\n" +
               "Hashes are also extraordinarily useful for storing relationships between data when you don't want to go whole hog and alter the objects themselves. For example, during course registration, it might be a good idea to be able to relate students to the classes they are taking. However, for whatever reason you might not want the Student object itself to know about that. Use a studentToClassRegistration hash and keep it around while you do whatever it is you need to do.\n" +
               "\n" +
               "They also make a fairly good first choice for a data structure except when you need to do one of the following:");
        System.out.println(" - When Not to use Hashtables");
        System.out.println("When Not To Use Hash Tables\n" +
               "\n" +
               "Iterate over the elements. Hash tables typically do not do iteration very well. (Generic ones, that is. Particular implementations sometimes contain linked lists which are used to make iterating over them suck less. For example, in Java, LinkedHashMap lets you iterate over keys or values quickly.)\n" +
               "\n" +
               "Sorting. If you can't iterate, sorting is a royal pain, too.\n" +
               "\n" +
               "Going from value to key. Use two hash tables. Trust me, I just saved you a lot of pain.\n");
        break;
      case "TreeMap":
        System.out.println("\n ---------------------");
        System.out.println("| Tree Map Advice |");
        System.out.println(" ---------------------");

        System.out.println(" - General Advice - ");
        System.out.println(" - Use Cases - ");
        System.out.println("File structures\n");
        break;
      case "Stack":
        System.out.println("\n ---------------------");
        System.out.println("| Stack / Queue Advice |");
        System.out.println(" ---------------------"); 

        System.out.println(" - General Advice - ");
        System.out.println(" - Use Cases - ");
        System.out.println("Queue is useful for Printers, Stack for Parsers\n");
        break;
      default:
        System.out.println("Unrecognised Type");
    }
  }
  public void setDataType(String in) { this.structDataType = in; }
  public void setInitialCondition(String in) { this.initialCondition = in; }
  public void setStableReq(boolean in) { this.stableReq = in; }
  public void setParallel(boolean in) { this.parallelReq = in; }
  public void setSpaceReq(boolean in) { this.spaceReq = in; }
  public String nameOf(Object o) { return o.getClass().getSimpleName(); }
  public String getStructID() { return structID; }
  public static void clearConsole() {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }
}

/*
switch case replacement - visitor pattern?

interface I {
  void do();
}

class A implements I { void do() { doA() } ... }
class B implements I { void do() { doB() } ... }
class C implements I { void do() { doC() } ... }

*/


