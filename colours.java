package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class colours {
    public static void main(String[] args) {
        ArrayList<String> colours=new ArrayList<>();
        colours.add("yellow");
        colours.add("red");
        colours.add("Blue");
        colours.add("Brown");
        colours.add("purple");
        colours.add("pink");
        colours.add("indigo");
        Collections.sort(colours);
        for(String i:colours){
            System.out.println(i);
        }
    }
}
