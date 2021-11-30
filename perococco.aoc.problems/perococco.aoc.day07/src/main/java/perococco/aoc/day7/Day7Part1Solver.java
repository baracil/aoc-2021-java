package perococco.aoc.day7;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day7.structures.BagGraph;

import java.util.stream.Stream;

public class Day7Part1Solver extends Day7Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day7Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
