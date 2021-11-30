package perococco.aoc.day12;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;

import java.util.stream.Stream;

public class Day12Part2Solver extends Day12Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day12Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
