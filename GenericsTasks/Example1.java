// Write a program to create a integer list and add, remove integers and iterate the list

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1{

    public static void main(String args[]){

        List<Integer> integerList = new ArrayList<Integer>();

        integerList.add(Integer.valueOf(10));
        integerList.add(Integer.valueOf(15));

        for(Integer data: integerList){
            System.out.println("Integer value: \n"+ data);
        }
        
    }
}