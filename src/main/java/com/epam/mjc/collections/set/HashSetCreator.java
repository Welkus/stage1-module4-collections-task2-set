package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : sourceList){
            if(i%2==0) {
                set.add(i);
                set.add(i/2);
            }
            else {
                set.add(i);
                set.add(i*2);
            }
        }
        return set;
    }
}
