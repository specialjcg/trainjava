package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import static java.util.stream.Collectors.toMap;

public class RemoveDuplicateIds {
    public static Map<Integer, List<String>> removeDuplicateIds(Map<Integer, List<String>> obj) {
        HashMap<Integer, List<String>> newList=new HashMap<>();
        Map<Integer, List<String>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(obj);
        Set<String> set = new HashSet<>(obj.values().stream().flatMap(List::stream).collect(Collectors.toList()));
        //remove all duplicates string in Map reverse
        for (Map.Entry<Integer, List<String>> entry : sortedMap.entrySet()) {
            Integer key = entry.getKey();
            List<String> list = entry.getValue();
            List<String> newbaseList = new ArrayList<>();
            for (String s : list) {
                if (set.contains(s)) {
                    set.remove(s);
                    newbaseList.add(s);
                }

            }
            newList.put(key,newbaseList );


        }
        return newList;
    }
//    interface Solution {
//        static Map<Integer, List<String>> removeDuplicateIds(Map<Integer, List<String>> obj) {
//            var seen = new HashSet<>();
//            return obj.entrySet().stream()
//                .sorted(Map.Entry.<Integer, List<String>>comparingByKey().reversed())
//                .collect(toMap(Entry::getKey,
//                               e -> e.getValue().stream().filter(seen::add).toList()
//                ));
//        }
//    }
}
