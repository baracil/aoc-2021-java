package perococco.aoc.day17;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.ArrayOfChar;
import perococco.aoc.common.GameOfLife;
import perococco.aoc.common.NotSolvedYet;

import java.util.stream.Stream;

public class Day17Part2Solver extends Day17Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day17Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
