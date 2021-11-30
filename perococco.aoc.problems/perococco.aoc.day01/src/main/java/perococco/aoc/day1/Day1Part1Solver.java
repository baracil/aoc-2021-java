package perococco.aoc.day1;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.AOCException;
import perococco.aoc.common.NotSolvedYet;

import java.util.Optional;
import java.util.stream.Stream;

public class Day1Part1Solver extends Day1Solver {

    public static AOCProblem<?> provider() {
        return new Day1Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
