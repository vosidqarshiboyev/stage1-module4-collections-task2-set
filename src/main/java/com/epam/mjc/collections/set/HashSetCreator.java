package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer>d=new HashSet<>();
        for(int i=0;i<sourceList.size();i++){
           if(sourceList.get(i)%2==0){
               Integer b=sourceList.get(i);
               while(b>0){
                   d.add(b);
                   b=b/2;
               }
           }
            else if(sourceList.get(i)%2==1){
                d.add(sourceList.get(i));
                d.add(sourceList.get(i)*2);
            }
        }

        return d;
    }
}
