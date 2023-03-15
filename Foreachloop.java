package Arraylist;

import java.util.ArrayList;

public class Foreachloop {
    public static void main(String[] args) {


        ArrayList<String> FRUITS = new ArrayList<String>();
        FRUITS.add("Orange");
        FRUITS.add("Mango");
        FRUITS.add("Apple");
        FRUITS.add("banana");
        for(String i : FRUITS){
            System.out.println(i);
        }
    }
}