package fpc.aoc.day3;

import lombok.NonNull;
import fpc.aoc.api.AOCProblem;
import fpc.aoc.common.NotSolvedYet;

import java.util.stream.Stream;

public class Day3Part1Solver extends Day3Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day3Part1Solver().createProblem();
    }

    @Override
    public @NonNull String solve(@NonNull DiagnosticReport input) {
        return PowerConsumption.fromDiagnostic(input).getRateProduct();
    }
}
