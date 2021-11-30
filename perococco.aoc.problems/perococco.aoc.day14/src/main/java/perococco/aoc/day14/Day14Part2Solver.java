package perococco.aoc.day14;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day14.structures.Memory;
import perococco.aoc.day14.structures.MemoryPart2;

import java.util.stream.Stream;

public class Day14Part2Solver extends Day14Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day14Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
