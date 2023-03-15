package Arraylist;

import java.util.ArrayList;

public class loopingthroughArraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("banana");
        for(int i = 0; i < fruits.size(); i++){
            System.out.println("Fruits include:"+fruits.get(i));
        }
    }
}
