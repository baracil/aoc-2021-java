package perococco.aoc.day4;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;

import java.util.stream.Stream;

public class Day4Part2Solver extends Day4Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day4Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
