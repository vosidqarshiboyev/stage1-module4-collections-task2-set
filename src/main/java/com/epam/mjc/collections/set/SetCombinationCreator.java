package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String>d=new HashSet<>();
        int flag1=0;
        int flag2=0;
        int flag3=0;
        for(String f:thirdSet){
            if(firstSet.contains(f)){
             flag1++;
            }
            if(secondSet.contains(f)){
                flag2++;
            }
            if(flag1==0 && flag2==0){
                d.add(f);
            }
            flag1=0;
            flag2=0;

        }
        for(String f:secondSet){
            if(firstSet.contains(f)&& !thirdSet.contains(f)){
                d.add(f);
            }
        }
        return d;
    }
}
