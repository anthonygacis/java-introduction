
import java.util.ArrayList;
import java.util.LinkedList; // node <-> node

public class DataStructure {

    public static void main(String[] args) {
        // Generic
        ArrayList<String> myArrayList = new ArrayList<>();
        
        myArrayList.add("hello"); // 0
        myArrayList.add("world"); // 0
        
        System.out.println(myArrayList.get(0)); // to access element 0
        System.out.println(myArrayList.get(1)); // to access element 1
        
        // contains
        if(myArrayList.contains("Hello")) {
            System.out.println("Contains: true");
        }else{
            System.out.println("Contains: false");
        }
        
        
        // 0 - Juan
        // 1 - Ben
        // Input: 1
        
        // 0 - Ben
        // Input: 0
        
        // to remove
        if(myArrayList.remove("Hello")) {
            System.out.println("Success");
        }else{
            System.out.println("Failed");
        }
//        myArrayList.remove("world");
//        myArrayList.remove("text");
        
        
        // size
        System.out.println("size: " + myArrayList.size());
        
        // using for loop
        System.out.println("using for loop");
        for(int i=0; i <myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
    
}