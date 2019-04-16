package dataStructureHomework;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(9);
        linkedList.add(14);
        linkedList.add(39);
        linkedList.add(99);


        System.out.println(linkedList.size());
        System.out.println("The content in the Linked List" +linkedList);
        for (Integer w: linkedList){
            System.out.println(w);

            System.out.println(linkedList.get(3));
            linkedList.set(0, 300);
            System.out.println(linkedList.get(3));


        }
    }


}




