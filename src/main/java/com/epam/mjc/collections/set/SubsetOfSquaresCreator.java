package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> adjustedSet = new TreeSet<>();

        for (int i : sourceList){
            adjustedSet.add(i*i);
        }

        return adjustedSet.subSet(lowerBound,true,upperBound,true);
    }
}
