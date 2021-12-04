package fpc.oac.day3;

import fpc.aoc.day3.Day3Part1Solver;
import fpc.aoc.day3.Day3Part2Solver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day3Test {

    public static final String INPUT = """
            00100
            11110
            10110
            10111
            10101
            01111
            00111
            11100
            10000
            11001
            00010
            01010
            """;

    @Test
    public void testExamplePart1() {
        final var actual = new Day3Part1Solver().createProblem(INPUT).solve();
        Assertions.assertEquals("198",actual);
    }

    @Test
    public void testExamplePart2() {
        final var actual = new Day3Part2Solver().createProblem(INPUT).solve();
        Assertions.assertEquals("230",actual);
    }


}
