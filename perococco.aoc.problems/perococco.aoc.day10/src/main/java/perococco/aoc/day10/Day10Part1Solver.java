package perococco.aoc.day10;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;

import java.util.Arrays;
import java.util.stream.Stream;

public class Day10Part1Solver extends Day10Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day10Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
