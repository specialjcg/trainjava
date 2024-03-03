package org.example;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighScores {

    private List<Integer> scores;

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
    }

    List<Integer> scores() {
         return this.scores;
    }

    Integer latest() {
        return this.scores.get(this.scores.size() - 1);
    }

    Integer personalBest() {
        return this.scores.stream().max(Integer::compareTo).get();
    }

    List<Integer> personalTopThree() {
        return this.scores.stream().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
    }
}
