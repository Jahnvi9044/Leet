

//This tutorial is to learn about list of list
import java.util.*;
public class ListOfList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<List<Integer>> listoflist=new ArrayList<>();
        List<Integer> inner=new ArrayList<>();
       inner.add(2);
        inner.add(20);
      /*  listoflist.add(inner);
        System.out.println(listoflist);
       // inner.clear();

        inner.set(0,3);
        inner.set(1,30);
        listoflist.add(inner);
       // inner.clear();
        inner.set(0,4);
        inner.set(1,40);
        listoflist.add(inner);
       // inner.clear();*/
/**
 * By running the above code the array list
 */
        for(int i=1;i<5;i++)
        {
            List<Integer> inner1=new ArrayList<>();
            inner1.add(i);
            inner1.add(i*10);
            listoflist.add(inner);
        }

        System.out.println(listoflist);
    }
}
