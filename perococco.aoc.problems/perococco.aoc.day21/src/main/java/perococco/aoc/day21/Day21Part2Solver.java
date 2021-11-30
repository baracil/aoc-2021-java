package perococco.aoc.day21;

import lombok.NonNull;
import perococco.aoc.api.AOCProblem;
import perococco.aoc.common.NotSolvedYet;
import perococco.aoc.day21.structures.Guide;
import perococco.aoc.day21.structures.Ingredient;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day21Part2Solver extends Day21Solver {

    public static @NonNull AOCProblem<?> provider() {
        return new Day21Part2Solver().createProblem().skipped();
    }

    @Override
    public @NonNull String solve(@NonNull Stream<String> input) {
        throw new NotSolvedYet();
    }
}
