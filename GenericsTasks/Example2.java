// Write a program to create a map with key as integer and value as integer, add integers and iterate

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example2{

    public static void main(String args[]){

        Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();

        integerMap.put(1,10);
        integerMap.put(2,11);

        Iterator<Integer> integerIterator = integerMap.keySet().iterator();

        while(integerIterator.hasNext()){
            int key = integerIterator.next();
            System.out.println("key: \n" + key);
            System.out.println("Value: \n" + integerMap.get(key));
        }
    }
}