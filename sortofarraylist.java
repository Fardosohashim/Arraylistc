package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class sortofarraylist {
    public static void main(String[] args) {
        ArrayList<String> Spices=new ArrayList<>();
        Spices.add("Garlic powder");
        Spices.add("Chilli powder");
        Spices.add("Rose mary");
        Collections.sort(Spices);
        for(String i:Spices){
            System.out.println(i);
        }
    }
}
