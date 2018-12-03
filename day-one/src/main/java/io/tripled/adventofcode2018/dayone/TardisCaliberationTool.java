package io.tripled.adventofcode2018.dayone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TardisCaliberationTool {

    private Integer frequency;
    private List<Integer> previousFrequencies = new ArrayList<>();
    private Integer firstDuplicate;

    TardisCaliberationTool() {
        frequency = 0;
    }

    TardisCaliberationTool(int frequency) {
        this.frequency = frequency;
    }

    void changeFrequency(int delta) {
        frequency = frequency + delta;
    }

    void changeFrequency(String input) {
        frequency = Arrays.stream(input.split("\n"))
                .mapToInt(Integer::valueOf)
                .reduce(frequency, (left, right) -> {
                    int nextFreq = left + right;
                    if (firstDuplicate == null && previousFrequencies.contains(nextFreq)) {
                        firstDuplicate = nextFreq;
                    }
                    previousFrequencies.add(nextFreq);
                    return nextFreq;
                });

    }

    Integer currentFrequency() {
        return frequency;
    }

    Integer firstDuplicateFrequency() {
        return firstDuplicate;
    }
}
