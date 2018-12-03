package io.tripled.adventofcode2018.dayone;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TardisCaliberationToolTest {

    @Test
    void determinesFrequencyStartingFromZero() {
        TardisCaliberationTool tool = new TardisCaliberationTool();
        tool.changeFrequency(1);

        assertThat(tool.currentFrequency()).isEqualTo(1);
    }

    @Test
    void determinesFrequencyStartingAtOne() {
        TardisCaliberationTool tool = new TardisCaliberationTool(1);

        tool.changeFrequency( -2);

        assertThat(tool.currentFrequency()).isEqualTo(-1);
    }

    @Test
    void determinesFrequencyWhenGivenMultipleDeltas() {
        TardisCaliberationTool tool = new TardisCaliberationTool();

        tool.changeFrequency( "+1\n" +
                "+6\n" +
                "+6\n" +
                "+2\n" +
                "+1");

        assertThat(tool.currentFrequency()).isEqualTo(16);
    }

    @Test
    void determinesFrequencyWhenGivenMultipleDeltasAndNegative() {
        TardisCaliberationTool tool = new TardisCaliberationTool();

        tool.changeFrequency( "+1\n" +
                "+6\n" +
                "+6\n" +
                "+2\n" +
                "-5");

        assertThat(tool.currentFrequency()).isEqualTo(10);
    }
}
