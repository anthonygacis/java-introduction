
import java.util.ArrayList;
import java.util.LinkedList; // node <-> node

public class DataStructure {

    public static void main(String[] args) {
        // linked list
        LinkedList<String> myLinkedList = new LinkedList<>();
        
        // same with array list
        // add()
        // remove()
        // get()
        // contains()
        // size()
        
        myLinkedList.add("hello");
        myLinkedList.add("world");
        myLinkedList.add("java");
        
        // queue methods
        myLinkedList.push("programming");
        
        System.out.println("0: " + myLinkedList.get(0));
        System.out.println("1: " + myLinkedList.get(1));
        System.out.println("2: " + myLinkedList.get(2));
        System.out.println("3: " + myLinkedList.get(3));
        
        // pop
        System.out.println("Using pop()");
        System.out.println(myLinkedList.pop());
        System.out.println(myLinkedList.pop());
        
        System.out.println("Using for loop");
        for(int i=0; i<myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
        
    }
    
}