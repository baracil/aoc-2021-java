package fpc.aoc.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDay1Solver {

    public static final String TEST_INPUT = """
            199
            200
            208
            210
            200
            207
            240
            269
            260
            263
            """;

    @Test
    public void testExampleDay1Part1() {
        final long actual = new Day1Part1Solver().createProblem(TEST_INPUT).solve();
        Assertions.assertEquals(7,actual);
    }

    @Test
    public void testExampleDay1Part2() {
        final long actual = new Day1Part2Solver().createProblem(TEST_INPUT).solve();
        Assertions.assertEquals(5,actual);
    }
}
