package Collectionframeworks;
import java.util.LinkedList;

public class LLMoreMethods3 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<Integer>();

        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        System.out.println(ll);

        Object object1 = ll.get(4); // gives the value of the element in the index of collection
        System.out.println(object1);
//        Object object2 = ll.get(900); // gives index out of bounds exception
//        System.out.println(object1);

        Class class1 = ll.getClass(); // gives the object's Class path in which it is present
        System.out.println(class1);

        object1 = ll.getFirst(); // gives first element
        System.out.println(object1);

        object1 = ll.getLast();// gives last element
        System.out.println(object1);

        int hashCode = ll.hashCode(); // it gives the unique identifier code used to store/retrieve objects efficiently
        System.out.println(hashCode);

        int indexOf = ll.indexOf(20); // index location of value
        System.out.println(indexOf);
        
        boolean EmptyOrNot=ll.isEmpty(); // gives true or false
        System.out.println(EmptyOrNot);
        
        ll.clear(); 
        boolean EmptyOrNot2=ll.isEmpty(); 
        System.out.println(EmptyOrNot2);
        
    }
}