package perococco.aoc.day25;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.input.Converter;
import perococco.aoc.input.SmartSolver;

import java.util.stream.Stream;

public class Day25Part2Solver extends Day25Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day25Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
