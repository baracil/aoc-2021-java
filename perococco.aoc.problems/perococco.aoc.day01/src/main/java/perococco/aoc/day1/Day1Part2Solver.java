package perococco.aoc.day1;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.AOCException;
import perococco.aoc.common.NotSolvedYet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Day1Part2Solver extends Day1Solver {

    public static AOCProblem<?> provider() {
        return new Day1Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
