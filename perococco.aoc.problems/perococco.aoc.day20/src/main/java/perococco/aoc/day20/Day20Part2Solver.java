package perococco.aoc.day20;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.common.Pattern;
import perococco.aoc.common.Transformation;
import perococco.aoc.day20.structures.ImageArray;

import java.util.stream.Stream;

public class Day20Part2Solver extends Day20Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day20Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }

}
