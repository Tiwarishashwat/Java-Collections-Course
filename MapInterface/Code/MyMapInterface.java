import java.util.*;

class MyMap{
public static void main(String[] args) {


    Map<Integer, String> classMap = new TreeMap<>( Collections.reverseOrder() );
// .........................
    classMap.put(1, "Shashwat");
    classMap.put(7, "Ayush");
    // System.out.println(classMap);
    classMap.putIfAbsent(3, "Pavleen");
    // System.out.println(classMap);
    classMap.putIfAbsent(2, "Aashray");
    // System.out.println(classMap);
    classMap.putIfAbsent(11, "Tridib");

    System.out.println(classMap);

    classMap.put(6, classMap.getOrDefault(6, "No One") +"Tiwari");
    System.out.println(classMap);
/*
    System.out.println( classMap.getOrDefault(4 , "No One"));
    

    System.out.println(classMap.containsKey(4) );
    System.out.println(classMap.containsValue("shashwat"));


    for( Map.Entry<Integer, String> entry : classMap.entrySet())
    {
        System.out.print( "Key: " + entry.getKey() );
        System.out.println( " Value: " + entry.getValue() );
    }


    for( Integer key : classMap.keySet() )
    {
        System.out.println( "Key: " + key );
    }

    for( String value : classMap.values() )
    {
        System.out.println( "Value: " + value );
    }

    for( Map.Entry<Integer, String> entry : classMap.entrySet())
    {

        System.out.println( " Value: " + entry.getValue() );
    }
*/

}
}

