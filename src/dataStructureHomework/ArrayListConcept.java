package dataStructureHomework;
import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();

        ar.add(10);
        ar.add(20);
        ar.add(30);
        System.out.println(ar.size());
        ar.add(40);
        System.out.println(ar.size());
        System.out.println(ar.get(0));
        ar.remove(2);
        System.out.println(ar.size());

        System.out.println("********");
        //printing all the values
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));

        }


        System.out.println("********");
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Tom");
        arr.add("Java");
        System.out.println(arr.size());
        System.out.println(arr.get(1));



        System.out.println("********");

        Constructor var = new Constructor("Daljeet", 23);
        Constructor var1 = new Constructor("Winson", 25);

        ArrayList<Constructor> arr2 = new ArrayList<Constructor>();
        arr2.add(var);
        arr2.add(var1);
        System.out.println(var.name+ " " + var.age);
        System.out.println(var1.name+ " "+ var.age);


    }
}


