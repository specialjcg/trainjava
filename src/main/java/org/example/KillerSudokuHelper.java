package org.example;
import java.util.*;

public class KillerSudokuHelper {

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {
        if (cageSize == 1)
            return 1 <= cageSum && cageSum <= 9 && !exclude.contains(cageSum) ? Arrays.asList(Arrays.asList(cageSum))
                : Collections.emptyList();

        List<List<Integer>> results = new ArrayList<>();
        for (int number = 1; number < 10; number++) {
            if (exclude.contains(number))
                continue;

            List<Integer> localExclude = new ArrayList<>(exclude);
            localExclude.add(number);

            for (List<Integer> combinations : combinationsInCage(cageSum - number, cageSize - 1, localExclude)) {
                List<Integer> combination = new ArrayList<>(Arrays.asList(number)) {
                    {
                        addAll(combinations);
                    }
                };

                Collections.sort(combination);
                if (!results.contains(combination))
                    results.add(combination);

            }
        }
        return results;
    }

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {
        return combinationsInCage(cageSum, cageSize, Collections.emptyList());
    }
}