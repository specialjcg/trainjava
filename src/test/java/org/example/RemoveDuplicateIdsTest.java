package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateIdsTest {
    @Test
    public void test() {
        LinkedHashMap<Integer, List<String>> obj,removeobj;
        obj = new LinkedHashMap<Integer, List<String>>();
        obj.put(1, List.of(new String[]{"F", "G"}));
        obj.put(2, List.of(new String[]{"C"}));
        obj.put(3, List.of(new String[]{"A", "B", "D"}));
        removeobj = new LinkedHashMap<>();
        removeobj.put(1, List.of(new String[]{"C", "F", "G"}));
        removeobj.put(2, List.of(new String[]{"A", "B", "C"}));
        removeobj.put(3, List.of(new String[]{"A", "B", "D"}));
        assertEquals(obj,
                     RemoveDuplicateIds.removeDuplicateIds(removeobj));

        obj = new LinkedHashMap<Integer, List<String>>();
        obj.put(1, List.of( new String[0]));
        obj.put(2, List.of( new String[0]));
        obj.put(3, List.of(new String[]{"A"}));
        removeobj = new LinkedHashMap<>();
        removeobj.put(1, List.of(new String[]{"A"}));
        removeobj.put(2, List.of(new String[]{"A"}));
        removeobj.put(3, List.of(new String[]{"A"}));
        assertEquals(obj,RemoveDuplicateIds.removeDuplicateIds(removeobj));
        obj = new LinkedHashMap<Integer, List<String>>();
        obj.put(432, List.of(new String[]{"A", "B", "D"}));
        obj.put(53, List.of( new String[]{"C"}));
        obj.put(236, List.of(new String[]{"L", "X", "G", "H"}));
        obj.put(11, List.of(new String[]{"P", "R", "S"}));

        removeobj = new LinkedHashMap<>();
        removeobj.put(432, List.of(new String[]{"A", "A", "B", "D"}));
        removeobj.put(53, List.of(new String[]{"L", "G", "B", "C"}));
        removeobj.put(236, List.of(new String[]{"L", "A", "X", "G", "H", "X"}));
        removeobj.put(11, List.of(new String[]{"P", "R", "S", "D"}));
        assertEquals(obj,RemoveDuplicateIds.removeDuplicateIds(removeobj));}

}