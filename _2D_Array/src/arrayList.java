import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        //wrapper classes
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//
//        Boolean b=Boolean.valueOf(true);
//        System.out.println(b);
//
//        Float f= Float.valueOf(4.8f);
//        System.out.println(f);

        // some built in methods of the arraylist
        ArrayList<Integer> l1=new ArrayList<>();// we can create arraylist of any pdt

        // add new element
        l1.add(4);
        l1.add(9);
        l1.add(6);
        l1.add(2);
        System.out.println(l1);

        //get an element at index i
        System.out.println(l1.get(1));

        //print with the loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        //printing the array list directly without loop
        System.out.println(l1);

        //adding an element at some index
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index
        l1.set(1,10);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(3);
        System.out.println(l1);

        //removing an element e
        System.out.println(l1.remove(Integer.valueOf(4)));
        System.out.println(l1);

        //checking an element if exist
        boolean ans=l1.contains(Integer.valueOf(2));
        System.out.println(ans);

        //if u don't specify class ,u can put any value inside
        ArrayList l=new ArrayList();
        l.add("p");
        l.add(8);
        l.add(4.5);
        System.out.println(l);

    }
}
