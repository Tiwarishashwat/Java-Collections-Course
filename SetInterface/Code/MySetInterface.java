import java.util.*;

public class MySetInterface {
    public static void main(String[] args) {
      
        Set<Integer> mySet = new TreeSet<>( Collections.reverseOrder() );

        mySet.add(1);
   
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
        mySet.add(2);
        System.out.println(mySet);

        Iterator<Integer> itr =  mySet.iterator();

        while(itr.hasNext())
        {
            System.out.println( itr.next() );
        }






}
}
