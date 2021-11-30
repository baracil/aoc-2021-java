package perococco.aoc.day19;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day19.structures.Day19Input;

import java.util.stream.Stream;

public class Day19Part1Solver extends Day19Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day19Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
