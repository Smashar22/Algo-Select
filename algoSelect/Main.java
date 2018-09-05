import java.util.*;
import java.lang.*;
public class Main {

  public static void main(String[] args) {

    int[] arr = new int[5];
    ArrayList arrList = new ArrayList();
    LinkedList<String> linkyList = new LinkedList<String>();
    Map<String, Integer> hMap = new HashMap<String, Integer>();
    Map<Integer,Integer> hTab = new Hashtable<Integer,Integer>();
    Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
    Stack stak = new Stack();


    AlgoSelect check = new AlgoSelect(arr);
    check.assessStruct();

    // work on arrays  

  }
}
