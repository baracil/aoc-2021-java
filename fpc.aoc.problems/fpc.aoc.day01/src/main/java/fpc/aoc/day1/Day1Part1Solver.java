package fpc.aoc.day1;

import fpc.aoc.api.AOCProblem;

public class Day1Part1Solver extends Day1Solver {

    public static AOCProblem<?> provider() {
        return new Day1Part1Solver().createProblem();
    }

    public Day1Part1Solver() {
        super(1);
    }
}
