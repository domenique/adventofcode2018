package io.tripled.adventofcode2018.dayone;

import java.util.Arrays;

class TardisCaliberationTool {

    private int frequency;

    TardisCaliberationTool() {
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
                .reduce(frequency, Integer::sum);

    }

    int currentFrequency() {
        return frequency;
    }
}
