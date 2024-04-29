package org.example;

import java.util.ArrayList;
import java.util.List;

public class KindergartenGarden {
    private final String gardenLayout;
    private final String[] students = {
        "Alice", "Bob", "Charlie", "David",
        "Eve", "Fred", "Ginny", "Harriet",
        "Ileana", "Joseph", "Kincaid", "Larry"
    };
    public KindergartenGarden(String gardenLayout) {
        this.gardenLayout = gardenLayout;
    }

    public List<Plant> getPlantsOfStudent(String student) {
        int studentIndex = getStudentIndex(student);
        int start = studentIndex * 2;
        int end = start + 2;

        String[] rows = gardenLayout.split("\n");
        String plants = rows[0].substring(start, end) + rows[1].substring(start, end);

        return parsePlants(plants);
    }

    private List<Plant> parsePlants(String plants) {
        List<Plant> plantNames = new ArrayList<>();
        for (char c : plants.toCharArray()) {
            plantNames.add(Plant.getPlant(c));
        }
        return plantNames;
    }

    private int getStudentIndex(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1; // Student not found
    }
}
