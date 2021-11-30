package perococco.aoc.day5;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day5.structures.BoardingPass;

import java.util.stream.Stream;

public class Day5Part1Solver extends Day5Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day5Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
