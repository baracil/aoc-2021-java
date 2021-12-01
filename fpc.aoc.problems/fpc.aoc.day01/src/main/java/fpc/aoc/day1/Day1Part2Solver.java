package fpc.aoc.day1;

import fpc.aoc.api.AOCProblem;

public class Day1Part2Solver extends Day1Solver {

    public static AOCProblem<?> provider() {
        return new Day1Part2Solver().createProblem();
    }


    public Day1Part2Solver() {
        super(3);
    }
}
