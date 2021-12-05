import fpc.aoc.api.AOCProblem;
import fpc.aoc.day5.Day5Part1Solver;
import fpc.aoc.day5.Day5Part2Solver;

module fpc.aoc.day5 {
    requires static lombok;

    requires fpc.aoc.input;
    requires com.google.common;

    exports fpc.aoc.day5;
    exports fpc.aoc.day5.struct;

    provides AOCProblem with Day5Part1Solver, Day5Part2Solver;
}
