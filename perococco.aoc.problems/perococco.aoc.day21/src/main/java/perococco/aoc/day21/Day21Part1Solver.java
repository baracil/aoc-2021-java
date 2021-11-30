package perococco.aoc.day21;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day21.structures.Guide;

import java.util.stream.Stream;

public class Day21Part1Solver extends Day21Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day21Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
