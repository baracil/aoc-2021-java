package perococco.aoc.day18;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day18.structures.ExpressionEvaluator;
import perococco.aoc.day18.structures.ExpressionEvaluatorPart1;

import java.util.stream.Stream;

public class Day18Part1Solver extends Day18Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day18Part1Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
