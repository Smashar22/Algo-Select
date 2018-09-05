
import java.util.*;
import java.lang.*;
import java.io.IOException;
// import java.lang.System;
import java.io.Console;

public class AlgoSelect {

  /*
  int[] arr = new int[5];
  ArrayList arrList = new ArrayList();
  LinkedList<String> linkylist = new LinkedList<String>();
  Map<String, Integer> hMap = new HashMap<String, Integer>();
  Map<Integer,Integer> hTab = new Hashtable<Integer,Integer>();
  Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
  Stack stak = new Stack();
  */

  public static void main(String[] args) {

    // -------- Data Structures -------- //

    int[] arr = new int[5];
    ArrayList arrList = new ArrayList();
    LinkedList<String> linkylist = new LinkedList<String>();
    Map<String, Integer> hMap = new HashMap<String, Integer>();
    Map<Integer,Integer> hTab = new Hashtable<Integer,Integer>();
    Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
    Stack stak = new Stack();
    // Queue que = new Queue();

    // -------- Data Structures -------- //


    System.out.println("\nSelect your data structure, using the number");
    System.out.println("1. Array");
    System.out.println("2. Array Object");
    System.out.println("3. Linked List");
    System.out.println("4. Hash Map");
    System.out.println("5. Hash Table");
    System.out.println("6. Tree Map");
    System.out.println("7. Stack\n");

    Console c = System.console();
    if (c == null) {
        System.err.println("No console.");
        System.exit(1);
    }

    String login = c.readLine("Enter the number of your structure: ");
    
    switch(login) {
      case "1":
        clearConsole();
        structUseCase(arr);
        break;
      case "2":
        clearConsole();
        structUseCase(arrList);
        break;
      case "3":
        clearConsole();
        structUseCase(linkylist);
        break;
      case "4":
        clearConsole();
        structUseCase(hMap);
        break;
      case "5":
        clearConsole();
        structUseCase(hTab);
        break;
      case "6":
        clearConsole();
        structUseCase(treeMap);
        break;
      case "7":
        clearConsole();
        structUseCase(stak);
        break;
      default:
        System.out.println("Incorrect input");
    }
    
  }

  public static void clearConsole() {
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  public static void structUseCase(Object o) {
    // Details all the scenarios wherein you would use a structure

    System.out.println("\n\nThis data structure is: " + nameOf(o));

    switch (nameOf(o)) {
      case "int[]":
        System.out.println("\n ---------------------");
        System.out.println("| Array/Vector Advice |");
        System.out.println(" ---------------------");

        System.out.println("\n - Questions - ");
        System.out.println("Is the data sorted? If yes, use x. If no, use y.");
        System.out.println("Is the data set large?(many array entries)");
        System.out.println("Is hard drive space a concern?");

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
        
        System.out.println("\n - Questions - ");
        System.out.println("\n - General Advice - ");
        System.out.println("\n - Use Cases - ");
        System.out.println("Something \n");
        break;
      case "LinkedList":

        System.out.println("\n ---------------------");
        System.out.println("| Linked List Advice |");
        System.out.println(" ---------------------");      
        System.out.println("\n - Questions - ");
        System.out.println("\n - General Advice - ");
        System.out.println("To sort use Collections.sort()");
        System.out.println("\n - Use Cases - ");
        System.out.println("Something \n");
        break;
      case "HashMap":
        System.out.println("\n ---------------------");
        System.out.println("| Hash Map Advice |");
        System.out.println(" ---------------------"); 
        
        System.out.println(" - Questions - ");
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

        System.out.println(" - Questions - ");
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

        System.out.println(" - Questions - ");
        System.out.println(" - General Advice - ");
        System.out.println(" - Use Cases - ");
        System.out.println("File structures\n");
        break;
      case "Stack":
        System.out.println("\n ---------------------");
        System.out.println("| Stack / Queue Advice |");
        System.out.println(" ---------------------"); 

        System.out.println(" - Questions - ");
        System.out.println(" - General Advice - ");
        System.out.println(" - Use Cases - ");
        System.out.println("Queue is useful for Printers, Stack for Parsers\n");
        break;
      default:
        System.out.println("Unrecognised Type");
    }
  }

  public static String nameOf(Object o) {
    return o.getClass().getSimpleName();
  }

}


