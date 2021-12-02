package fpc.aoc.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day02Test {

    public static final String INPUT = """
            forward 5
            down 5
            forward 8
            up 3
            down 8
            forward 2
            """;

    @Test
    public void testPart1() {
        final long actual = new Day2Part1Solver().createProblem(INPUT).solve();
        Assertions.assertEquals(150, actual);
    }

    @Test
    public void testPart2() {
        final long actual = new Day2Part2Solver().createProblem(INPUT).solve();
        Assertions.assertEquals(900, actual);
    }
}
