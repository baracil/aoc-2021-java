import perococco.aoc.api.AOCProblem;
import perococco.aoc.day14.Day14Part1Solver;
import perococco.aoc.day14.Day14Part2Solver;

module perococco.aoc.day14 {
    requires static lombok;

    requires perococco.aoc.input;
    requires com.google.common;
    exports perococco.aoc.day14;
    exports perococco.aoc.day14.structures to perococco.aoc.input;

    provides AOCProblem with Day14Part1Solver, Day14Part2Solver;
}
