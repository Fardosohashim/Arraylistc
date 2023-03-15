package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylistininteger {
    public static void main(String[] args) {
        ArrayList<Integer>myNumber=new ArrayList<Integer>();
        myNumber.add(80);
        myNumber.add(70);
        myNumber.add(60);
        myNumber.add(10);
        myNumber.add(30);
        Collections.sort(myNumber);

        for(int i:myNumber){
            System.out.println(i);
        }
    }
}
