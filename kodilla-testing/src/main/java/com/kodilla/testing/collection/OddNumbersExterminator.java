package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> theList) {
        ArrayList<Integer> evenNumberList = new ArrayList<Integer>();
        for (int n = 0; n < theList.size(); n++) {
            if (theList.get(n) % 2 == 0) {
                evenNumberList.add(theList.get(n));
            }
        }
        return evenNumberList;
    }
}
