package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> setThree = new HashSet<>(thirdSet);
        Set<String> combined = new HashSet<>(firstSet);

        setThree.removeAll(firstSet);
        setThree.removeAll(secondSet);

        Set<String> newSet = new HashSet<>(setThree);

        combined.retainAll(secondSet);
        combined.removeAll(thirdSet);

        newSet.addAll(combined);


        return newSet;
    }
}
