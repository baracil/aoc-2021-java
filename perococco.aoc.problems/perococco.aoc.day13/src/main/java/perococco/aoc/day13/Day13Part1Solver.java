package perococco.aoc.day13;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;

import java.util.stream.Stream;

public class Day13Part1Solver extends Day13Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day13Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
